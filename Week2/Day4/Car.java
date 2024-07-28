package week2.day4;

public class Car extends Vehicle {
	
	//extends keyword which will inherit the properties
	//Car - Child class/SubClass/DerivedClass
	//Vehicle Class- BaseClass/SuperClass/ParentClass
	
  public void sevenseatFacility() {
		System.out.println("7 Seater");

	}
	
	public static void main(String[] args) {
	//Creating object for Car Class
	Car carObject=new Car();
	carObject.applyBrake();
	carObject.makeHorn();
	carObject.sevenseatFacility();
}
}
