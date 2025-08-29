package WindowsAndFramesTasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Herokuapp_FramesHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/nested_frames");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.switchTo().frame("frame-top");

		List<WebElement> AllThreeFrames = driver.findElements(By.tagName("frame"));

		System.out.println("Frames Size in the Top Frame is: "+AllThreeFrames.size());

		if(AllThreeFrames.size()==3) {
			System.out.println("3 Frames present in the Top Frame");
		} else {
			System.out.println("No Frames present present in the Top Frame");
		}

		driver.switchTo().frame("frame-left");

		WebElement LeftFrameText = driver.findElement(By.tagName("body"));

		if(LeftFrameText.getText().equals("LEFT")) {
			System.out.println("Left Frame has the text LEFT");
		} else {
			System.out.println("Left Frame not having the text LEFT");
		}

		driver.switchTo().parentFrame();

		Thread.sleep(1000);

		driver.switchTo().frame("frame-middle");

		WebElement MiddleFrameText = driver.findElement(By.tagName("body"));

		if(MiddleFrameText.getText().equals("MIDDLE")) {
			System.out.println("Middle Frame has the text MIDDLE");
		} else {
			System.out.println("Middle Frame not having the text MIDDLE");
		}
		
		driver.switchTo().parentFrame();

		Thread.sleep(1000);
		
		driver.switchTo().frame("frame-right");
		
		WebElement RightFrameText = driver.findElement(By.tagName("body"));

		if(RightFrameText.getText().equals("RIGHT")) {
			System.out.println("Right Frame has the text RIGHT");
		} else {
			System.out.println("Right Frame not having the text RIGHT");
		}
		
		driver.switchTo().parentFrame();

		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame-bottom");
		
		WebElement BottomFrameText = driver.findElement(By.tagName("body"));

		if(BottomFrameText.getText().equals("BOTTOM")) {
			System.out.println("Bottom Frame has the text BOTTOM");
		} else {
			System.out.println("Bottom Frame not having the text BOTTOM");
		}
		
		driver.switchTo().parentFrame();
		
		driver.quit();

	}

}
