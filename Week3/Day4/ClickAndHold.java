package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://jqueryui.com/selectable/");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame(0);
		
		//Find element 1
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));

		
		//Find Element 2
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		
	//Actions Class Instantiation
		Actions actClick=new Actions(driver);
	//To perform multiple actions
		
		actClick.clickAndHold(item1).clickAndHold(item2).perform();
		
		
	
	}

}
