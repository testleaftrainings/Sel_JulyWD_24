package week5.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends BaseClass {
	
	@BeforeTest
	public void setValues() {
	 fileName="CreateLead";

	}
	
	
	@Test(dataProvider = "FetchData")
	public void runCreateLead(String cName, String fName, String lName) {
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);  //TestLeaf     qeagle  
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);        // Hari        Vineeth
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);            //R            Rajendran           
		driver.findElement(By.name("submitButton")).click();
		
		
		
	}	

}
	
	
	
	







