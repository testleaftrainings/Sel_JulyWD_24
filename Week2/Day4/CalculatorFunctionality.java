package week2.day4;

public class CalculatorFunctionality {
	
	public void addNumbers(int num1,int num2) {
	System.out.println(num1+num2);
	}
	
    public void addNumbers(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
	}
    
    public float addNumbers(float num1,float num2) {
	System.out.println(num1+num2);
	return num1;

	}
	
	public static void main(String[] args) {
		CalculatorFunctionality calc=new CalculatorFunctionality();
		calc.addNumbers(1, 1);
		calc.addNumbers(3, 4, 5);
	    calc.addNumbers(1.5f, 0.5f);
	}
	
}
