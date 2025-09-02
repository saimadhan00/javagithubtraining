import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenumWebComponent {

	public static void main(String[] args) throws InterruptedException {
		
		
        WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/datepicker/");

    
		
        WebElement frame1 = driver.findElement(By.cssSelector(".demo-frame"));
        driver.switchTo().frame(frame1);

        WebElement nextMonthBtn = driver.findElement(By.xpath("//input[@id='datepicker']"));
        nextMonthBtn.click();
        // Next month button
        driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

        // Next month 22
        WebElement dateElement = driver.findElement(By.xpath("//a[@class='ui-state-default' and @data-date='22']"));
        driver.findElement(By.xpath("//a[@class='ui-state-default' and @data-date='22']")).click();
        
        dateElement.click();
       
        String dateValue = dateElement.getText();
        System.out.println("Selected Date is: " + dateValue);

        driver.quit();

        
	}

}


