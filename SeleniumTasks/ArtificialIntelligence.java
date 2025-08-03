package SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArtificialIntelligence {

    public static void main(String[] args) throws InterruptedException {

       
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org/");

       driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys(" Artificial Intelligence");
       
       Thread.sleep(5000);
       
       driver.findElement(By.xpath("//button [@type='submit']")).click();
       
       Thread.sleep(5000);
       
       driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table/tbody/tr[8]/td/div/div[1]/a")).click();
       
       String title = driver.getTitle();
       System.out.println("Page Title: " + title);
       
     
       
    }
}
