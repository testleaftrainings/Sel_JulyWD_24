package week1.day3;

public class LearnMethodWithArguments {
	
	public void takePhoto(String ext) {
	System.out.println(ext);
	}
	
	public void enableBrowser(String browserName, int browserVersion) {
		
System.out.println(browserName+" "+browserVersion);
	}
	
	public static void main(String[] args) {
		LearnMethodWithArguments argu=new LearnMethodWithArguments();
		argu.takePhoto("jpeg");
		argu.takePhoto("Jpj");
		argu.enableBrowser("Edge", 10);
		argu.enableBrowser("Chrome", 7);
	}
	
}
