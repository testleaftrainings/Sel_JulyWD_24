package week2.day4;

public class Auto extends Car {
	
	
	public void threeSeaterFacility() {
		System.out.println("3 Seater facility");

	}
	
        public static void main(String[] args) {
		Auto aut=new Auto();
		aut.applyBrake();
		aut.makeHorn();
		aut.threeSeaterFacility();
		aut.sevenseatFacility();
	}

}
