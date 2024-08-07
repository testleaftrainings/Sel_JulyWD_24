package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class CreateLead extends BaseClass {

	@Test(invocationCount = 5 ,invocationTimeOut = 100)
	public void runCreateLead() {
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Qeagle");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
		driver.findElement(By.name("submitButton")).click();
		
}
	
	
	
		

}
	
	
	
	







