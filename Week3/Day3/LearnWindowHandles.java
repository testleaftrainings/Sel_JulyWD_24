package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://leafground.com/window.xhtml");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//To get the address of current window
		 String parentWindowAdress = driver.getWindowHandle();
		 System.out.println("Parent Adress: "+parentWindowAdress);
		
		//To click the open button
		  driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		
		//To get the address of all opened window
		Set<String> allWindowsAdress = driver.getWindowHandles();
		System.out.println("All window adress: "+allWindowsAdress);
		 
		//Get parent title
		String parentTitle = driver.getTitle();
		System.out.println("Parent title : "+parentTitle);
		 
	     //Index starts 0 in window handling
		 
		 //Convert Set into List
		 List<String> allWindowsList=new ArrayList<String>(allWindowsAdress);
		 
		 driver.switchTo().window(allWindowsList.get(1));
		 
		 //Get the title of child page
		 String childTitle = driver.getTitle();
		 
		 System.out.println("Child window address: "+childTitle);
		 
		 
		 //close -Child window closed but driver focus is in child window only
		 driver.close();
		 
		 //switch back to parent window
		 driver.switchTo().window(allWindowsList.get(0));
		 String parentWindow = driver.getTitle();
		 System.out.println("Parent window address: "+parentWindow);
		 
		 }

}
