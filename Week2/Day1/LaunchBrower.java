package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrower {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Entering the url
		  driver.get("https://www.facebook.com/");
		
		//Maximise the browser
		  driver.manage().window().maximize();
		
		
        //close the browser
		  driver.close();
		
		}

}
