package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://leafground.com/frame.xhtml");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Handling outer frame
		WebElement outerFrame = driver.findElement(By.xpath("//h5[contains(text(),'Inside Nested frame')]/following::iframe"));

		
		//Transfer the driver focus to outer frame
		driver.switchTo().frame(outerFrame);
		
		
		//Transfer the driver focus to inner frame
		driver.switchTo().frame("frame2");
		
		//Click the button
		driver.findElement(By.id("Click")).click();
		
		//Switching to immediate parent frame
		driver.switchTo().parentFrame();
		
		
		//Switching to the main webpage
		 driver.switchTo().defaultContent();
		
	}

}
