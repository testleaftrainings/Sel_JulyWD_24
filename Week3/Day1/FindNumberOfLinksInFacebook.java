package week3.day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNumberOfLinksInFacebook {
    //Get all the links present in facebook
	
	public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	//findElement-WebElement
	
	//To find multiple elements- findElements 
	//List<WebElement>
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	
	int totalLinks = allLinks.size();
	System.out.println(totalLinks);
	
	//To retrieve all the links
	//empty list
	List<String> allLinksData =new ArrayList<String>();
	
	//To convert WebElement to String- getText

	for (int i = 0; i < totalLinks; i++) {
		String text = allLinks.get(i).getText();
		
		allLinksData.add(text);
	}
	System.out.println("All links are: "+allLinksData);

	}

}
