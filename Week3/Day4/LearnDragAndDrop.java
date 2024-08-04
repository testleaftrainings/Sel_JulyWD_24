package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDrop {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://jqueryui.com/droppable/");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		
		//find the source element
		WebElement source = driver.findElement(By.id("draggable"));
		
		//find the target element
		WebElement target = driver.findElement(By.id("droppable"));
		
		
		//Instantiating the Actions Class
		
		Actions actDrag=new Actions(driver);
		
		actDrag.dragAndDrop(source, target).perform();
		

	}

}
