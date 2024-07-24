package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		 //Launch the driver
		 ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps"); 
		
		//Maximise the window
		driver.manage().window().maximize();
		
		//Enter the username
		//Attribute Based
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");

		//Enter password
		//Partial attribute based
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("crmsfa");
	
	    //Click login button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//To Click the Leads button
		driver.findElement(By.xpath("//a[text()='Leads']"));
		
		//To click Create Lead
		driver.findElement(By.xpath("(//a[contains(text(),'Lead')])[3]")).click();
		
		
	}

}
