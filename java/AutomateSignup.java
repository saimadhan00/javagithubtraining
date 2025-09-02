import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateSignup {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://www.guvi.in/");
        
        WebElement SignUpBtn = driver.findElement(By.xpath("//a[contains(text(),\"Sign up\")]"));
        SignUpBtn.click();
        
        WebElement FullName = driver.findElement(By.xpath("//input[@id='name']"));
        FullName.sendKeys("Madhan kumar");
        
        WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
        Email.sendKeys("Test00015@gmail.com");	
        
        WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
        Password.sendKeys("Pass@123");
        
        WebElement MobileNumber = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
        MobileNumber.sendKeys("9876543210");
        
        WebElement SignUpBtn_Again = driver.findElement(By.xpath("//a[@id='signup-btn']"));
        SignUpBtn_Again.click();
        Thread.sleep(2000);
        
        WebElement yourCurrentProfile = driver.findElement(By.id("profileDrpDwn"));
        Select s = new Select(yourCurrentProfile);
        s.selectByVisibleText("Working professional in IT");
        
        WebElement DegreeDropdown = driver.findElement(By.id("degreeDrpDwn"));
        Select d =new Select(DegreeDropdown);
        d.selectByVisibleText("B.E. / B.Tech. Mechanical Engineering");
        
        WebElement PassedOutYear = driver.findElement(By.xpath("//input[@id='year']"));
        PassedOutYear.sendKeys("2018");
        
        WebElement SubmitBtn = driver.findElement(By.xpath("//a[@id='details-btn']"));
        SubmitBtn.click();
        Thread.sleep(2000);
        
        WebElement AlmostDoneText = driver.findElement(By.xpath("//div[@class=\"left-head\"]//h1"));
        String text = AlmostDoneText.getText();
        System.out.println("Navigating to mail text: "+text);
        
        WebElement GuviNavigation = driver.findElement(By.xpath("//a[@class=\"navbar-guvilogo-black\"]"));
        GuviNavigation.click();
        
        
        WebElement SignUpBtn2 = driver.findElement(By.xpath("//a[contains(text(),\"Sign up\")]"));
        SignUpBtn2.click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//a[@class=\"login\"]")).click(); 
        //step 6 login form fill
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test00015@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pass@123");
        Thread.sleep(2000);
        //step 7 login
        driver.findElement(By.xpath("//a[@id='mobile-login']")).click();
        Thread.sleep(2000);
        driver.close();
        
		
	}

}
