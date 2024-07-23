package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLeaftapsByXpath {

	public static void main(String[] args) {
		         //Launch the driver
				 ChromeDriver driver=new ChromeDriver();
				
				//Load the url
				driver.get("http://leaftaps.com/opentaps"); 
				
				//Maximise the window
				driver.manage().window().maximize();
				
				//Enter username
                 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	
	            //Enter the password
                 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	
                 //Click login
                 driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	}

}
