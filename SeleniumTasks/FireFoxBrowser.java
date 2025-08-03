package SeleniumTasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver=new FirefoxDriver ();
		
		Thread.sleep(10000);
		
		driver.get("http://google.com/");
		
		driver.manage().window().maximize();
	
		
		System.out.println("driver.current_url");
		
		driver.navigate().refresh();
		
		driver.close();

	}

}
