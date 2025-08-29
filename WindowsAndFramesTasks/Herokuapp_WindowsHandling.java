package WindowsAndFramesTasks;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Herokuapp_WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		String OriginalWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
		
		Set<String> AllWindows = driver.getWindowHandles();
		
		String ChildWindow = "New Window";
		
		for(String ChildTitle : AllWindows) {
			if(driver.switchTo().window(ChildTitle).getTitle().equals(ChildWindow)) {
				String title = driver.getTitle();
				Assert.assertEquals(title, ChildWindow);
				System.out.println("Child Window Title Verified Successfully");
			}
		}
		
		driver.close();
		
		Thread.sleep(1000);
		
		driver.switchTo().window(OriginalWindow);
		
		WebElement OriginalWindowText = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3"));
		String text = OriginalWindowText.getText();
		System.out.println("Original Window is active and its title is: "+text);
		
		driver.quit();

	}

}
