package SeleniumTasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver=new FirefoxDriver ();
		
		Thread.sleep(3000);
		
		driver.get("http://google.com/");
		
		driver.manage().window().maximize();
	
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentUrl);

		
		driver.navigate().refresh();
		
		driver.close();

	}

}
