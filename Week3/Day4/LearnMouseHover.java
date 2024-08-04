package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {

	public static void main(String[] args) {
		//Launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the url
				driver.get("https://www.pvrcinemas.com/");
				
				//Maximize window
				driver.manage().window().maximize();
				
				//Add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Find the element
				WebElement mouseHoverElement = driver.findElement(By.xpath("//span[text()='More']"));
				
				//Instantiate Actions Class
				
				Actions act=new Actions(driver);
				act.moveToElement(mouseHoverElement).perform();

	}

}
