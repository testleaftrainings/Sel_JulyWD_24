package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebDriverMethods {

	public static void main(String[] args) {
		
		//Launch the driver
		 ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps"); 
		
		//Maximise the window
		driver.manage().window().maximize();
		
		//To get the title of the page
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		//to verify the pageTitle
		boolean pageVerification = pageTitle.equals("Leaftaps - TestLeaf Automation Platform");
		System.out.println("Title "+pageVerification);
		
		//To get the current url
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url is: "+currentUrl);
		
		}

}
