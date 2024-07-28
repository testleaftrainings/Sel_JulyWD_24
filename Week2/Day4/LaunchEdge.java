package week2.day4;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge extends LaunchChrome {
	
	public void launchBrowser() {
		System.out.println("EdgeDriver driver=new EdgeDriver();");
       
	}
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		LaunchEdge edge=new LaunchEdge();
		edge.launchBrowser();

	}

}
