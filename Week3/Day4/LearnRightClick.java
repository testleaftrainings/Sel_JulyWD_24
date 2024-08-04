package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnRightClick {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://swisnl.github.io/jQuery-contextMenu//demo.html");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Find Right click me button
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

		
		//Actions Class Instantiation
		Actions actRight=new Actions(driver);
		
		actRight.contextClick(rightClick).perform();
		
		
		
		
		
	}

}
