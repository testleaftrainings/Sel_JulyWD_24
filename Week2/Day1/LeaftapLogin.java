package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapLogin {

	public static void main(String[] args) {
	   //Launch the browser
		ChromeDriver driver =new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximise the browser
		driver.manage().window().maximize();
		
		//To Find the webElement
		//To enter username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		
		//To enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		
		//Click Login button
		driver.findElement(By.className("decorativeSubmit")).click();
			
	}

}
