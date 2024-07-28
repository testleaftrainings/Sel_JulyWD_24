package week2.day4;

public class Vehicle {
	
    public void applyBrake() {
		System.out.println("Brake Applied");

	}
	
	public void makeHorn() {
		System.out.println("Make Horn");

	}
	public static void main(String[] args) {
		//ClassName objName=new ClassName();
		  Vehicle veh=new Vehicle();
		  veh.applyBrake();
		  veh.makeHorn();
	}
	

}
