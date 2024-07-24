package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWaits {

	public static void main(String[] args) throws InterruptedException {
		//Launch the driver
		 ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps"); 
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Adding implicit wait
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	    //Thread.sleep(5000);   //Slows down the execution for 5 Seconds
		//Close the browser
          driver.close();
            
	}

}
