package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtables {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://leafground.com/table.xhtml");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Locate the table
		WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody"));

		//Count the number of rows
		List<WebElement> rowCount = table.findElements(By.tagName("tr"));
		
		System.out.println("Row Count is: "+rowCount.size());
		
		//To get the column count
		//List<WebElement> columnCount = table.findElements(By.tagName("th"));
		
		//System.out.println(columnCount.size());
		List<WebElement> columnCount = table.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]//th"));
		
	System.out.println("Column Count is: "+columnCount.size());
	
	//Retrieve a particular row value
	List<WebElement> secondRowValue = table.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[2]/td"));
	int listSize = secondRowValue.size();
	
	
	for (int i = 0; i < listSize; i++) {
		String secondRow = secondRowValue.get(i).getText();
		System.out.println("SecondRowvalues: "+secondRow);
	}
	
	//Retrieve the entire data in the webtable
	
	
	
	for (int i = 1; i <= rowCount.size(); i++) {
		WebElement eachRow = table.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]/td"));

		
		for (int j = 1; j <= columnCount.size(); j++) {
			WebElement allValues = eachRow.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]/td["+j+"]"));
		System.out.println("All data are: "+allValues.getText());
		}
	
	
	}
	
	
}
	
	
}
