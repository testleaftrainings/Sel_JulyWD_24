package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSweetAlert {

	public static void main(String[] args) {
		        //Launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the url
				driver.get("https://www.leafground.com/alert.xhtml");
				
				//Maximize window
				driver.manage().window().maximize();
				
				//Add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Click show button on sweel alert
	
				
				driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();

				//Click dismiss button
				driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
				
	}

}
