package week4.day1;

public class LearnStaticKeyword {
	
	//Local variable - specified inside any method
	//Global variable - Not specified inside any method
	
	//static by variable level
	int num=7;
    static String name="Vineeth";
	
    //Normal method
	public void normalMethod() {
		System.out.println("Its from normal method");

	}
	
	
	//Normal Block
	{
	System.out.println("Normal block");
	}
	
	//Static Block
	static {
		System.out.println("static block");
		System.out.println(name);
		//System.out.println(num);
		}
	
	//Static method
	public static void staticMethod() {
	System.out.println("Its From static method");	
	System.out.println(name);
	//System.out.println(num); not able to non static variables
	}
	
	//Main method
	public static void main(String[] args) {
		LearnStaticKeyword learnStatic=new LearnStaticKeyword();
        System.out.println(learnStatic.num);
        System.out.println(name);
        learnStatic.normalMethod();
        staticMethod();
        
	}

}
