package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadFunctionality {

	public static void main(String[] args) throws InterruptedException {
		//Launch the driver
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps"); 
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
        //Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		
		//Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click crmsfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//PatiallinkText
		//driver.findElement(By.partialLinkText("SFA"))
		
		
		//Click Leads
		driver.findElement(By.linkText("Leads")).click();
		
		//Click create lead
	    driver.findElement(By.linkText("Create Lead")).click();
	    
	    //To enter companyName
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	
	    //To enter first name
	
	      driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
	    
	      //To enter lastname
	      
	      driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
	
	       //Handling dropdown
	       //Select Class
	      
	      //Step1: Find the element
	      //return type of findElement is WebElement
	      
	      WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
	      
	      //Step2: Instantiate the Select Class
	      
	      Select dd1=new Select(sourceDropdown);
	      
	       // dd1.selectByIndex(2);
	       // dd1.selectByVisibleText("Employee");
	          dd1.selectByValue("LEAD_DIRECTMAIL");
	      
	      //Thread.sleep(5000);
	      //Click submit button
	        driver.findElement(By.name("submitButton")).click();
	}

}
