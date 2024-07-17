package week1.day3;

public class LearnReturnTypes {
	
	public String takeScreenshot() {
		return "png";
    }
	
	public int enableBrowser() {
		return 7;

	}
	
	public boolean isCameraAvailable() {
		return true;

	}
	
	public static void main(String[] args) {
		LearnReturnTypes ret=new LearnReturnTypes();
		System.out.println(ret.takeScreenshot());
		System.out.println(ret.enableBrowser());
		System.out.println(ret.isCameraAvailable());
	}

}
