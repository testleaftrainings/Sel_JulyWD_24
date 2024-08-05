package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWindowsExplicitWait {

	public static void main(String[] args) {

		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://leafground.com/window.xhtml");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Instantiate WebDriverWait class
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1));
		
		//Use condition
		WebElement windowClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Open Multiple']")));
		windowClick.click();
		
		Boolean windowsVisiblity = wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println("Window Visiblity: "+windowsVisiblity);

	}

}
