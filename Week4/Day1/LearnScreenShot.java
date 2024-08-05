package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenShot {

	public static void main(String[] args) throws IOException {
ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Step1: use getScreenshot method for source file
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		//Step2: To add the destination
		File destination=new File("./snap/leaftaploginpage.png");
		
		//Connect the source and destination
		FileUtils.copyFile(source, destination);
		
		
		//Screen Of an element
		
		//Step1: findElement
		WebElement leaftapLabel = driver.findElement(By.xpath("//label[text()='Username']"));
		
		//Step2: use getScreenshot method for source file
		File usernamesource = leaftapLabel.getScreenshotAs(OutputType.FILE);
		
		//Step3:Add destination
		File usernameDest=new File("./snap/username.png");
		
		//Step 4: connect source and destination
		FileUtils.copyFile(usernamesource, usernameDest);
		
		
	}

}
