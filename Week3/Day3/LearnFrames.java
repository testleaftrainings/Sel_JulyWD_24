package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the url
				driver.get("https://leafground.com/frame.xhtml");
				
				//Maximize window
				driver.manage().window().maximize();
				
				//Add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
			   //Step1: Transfer the driver focus
				
				//driver.switchTo().frame(0);
				
				Thread.sleep(3000);
				//Click the frame click me button
				driver.findElement(By.id("Click")).click();
				
       }

}
