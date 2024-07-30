package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSimpleAlert {

	public static void main(String[] args) {
		
		
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click show button
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//Transfer driver focus to alert box
		
		Alert simpleAlert = driver.switchTo().alert();
		
		//String simpleAlertText = simpleAlert.getText();
		//System.out.println(simpleAlertText);
		
		 simpleAlert.accept();
		 
		 String simpleAlertText = simpleAlert.getText();
		 //System.out.println(simpleAlertText);
	
		
		
		
		

	}

}
