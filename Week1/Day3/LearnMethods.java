package week1.day3;

public class LearnMethods {
	
	//2 types of methods
	//Main -execute the program
	//Normal -to perform an action
	
	//Mobile
	
	//makeCall ,sendSms, takePhoto, switchOn, enableBrowser
    //makeCall - camelCase
	
	//declare method
	
	//access modifier   //returnType      //methodName
	public               void             makeCall() {
    System.out.println("Make Call");
	}
	
	//type methodName->Type ctrl+space
	
	public void sendSms() {
	System.out.println("Send SMS");

	}
	
	public static void main(String[] args) {
		//ClassName objectName=new ClassName();
		LearnMethods obj=new LearnMethods();
		obj.makeCall();
		obj.sendSms();
		
}
	
}
