package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {
	
	
	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		//Transfering the driver focus to Alert box
		Alert promptAlert = driver.switchTo().alert();
		
		String promptAlertText = promptAlert.getText();
		
		System.out.println("Text is: "+promptAlertText);
		
		//Enter value in the text field
		
		promptAlert.sendKeys("Prompt alert is handled");
		
		//accept
		promptAlert.accept();
		
	}

}
