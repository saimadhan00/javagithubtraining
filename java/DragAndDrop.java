import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        Thread.sleep(3000);

        // Step 1: Switch to iframe where draggable and droppable reside
        driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));

        // Step 2: Source and Target elements
        WebElement Drag = driver.findElement(By.id("draggable"));
        WebElement Drop = driver.findElement(By.id("droppable"));

        // Step 3: Perform drag and drop
        Actions Act = new Actions(driver);
        Act.dragAndDrop(Drag, Drop).perform();
        Thread.sleep(2000);

        // Step 4: Verify color change - CSS property
        String colorAfterDrop = Drop.getCssValue("background-color");
        System.out.println("After drop color: " + colorAfterDrop);

        // Step 5: Verify text change to "Dropped!"
        String textAfterDrop = Drop.getText();
        System.out.println("After drop text: " + textAfterDrop);

        // Optional: Assertion-style check (basic)
        if (textAfterDrop.equals("Dropped!")) {
            System.out.println("Drag and drop operation successful.");
        } else {
            System.out.println("Drag and drop operation failed.");
        }

        driver.switchTo().defaultContent();
        driver.quit();
    }
}
