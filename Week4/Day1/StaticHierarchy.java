package week4.day1;

public class StaticHierarchy {
	
	
	
	//Normal Block
	{
		System.out.println("Normal Block");
	}
	
	//Static Block
	static {
		System.out.println("static Block");
	}

	
    //Normal Method
	public void normalMethod() {
		System.out.println("Normal method");

	}
	
	//Static Method
	public static void staticMethod() {
		System.out.println("Static method");
		
}
	
	//Main method
	public static void main(String[] args) {
		StaticHierarchy st=new StaticHierarchy();
	    st.normalMethod();
	    staticMethod();
	}
}
