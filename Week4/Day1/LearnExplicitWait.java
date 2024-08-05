package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) {
		//Launch the browser
        ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://leafground.com/waits.xhtml");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Instantiate webdriverwait class
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		
		//Use the condition
		WebElement firstElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click']")));
		
		//Click the element
		firstElement.click();
		
		//Use condition
		WebElement visibleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		boolean visible = visibleElement.isDisplayed();
		System.out.println("Visibility checking: "+visible);
		
		//Use condition
	      WebElement secondClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Click'])[2]")));
		secondClick.click();
		
		//Invisiblitymethod
		Boolean invisibleWE = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='I am about to hide']")));
		System.out.println("Element Visibilty :"+invisibleWE);
		
	}

}
