package week3.day1;

public class ImplementationClass extends Axis{

	@Override
	public void withdrawalLimit() {
		System.out.println("Limit50000");
		
	}

	@Override
	public void carLoan() {
		System.out.println("Car-100000");
		
	}
	
	
	public void goldLoan() {
		System.out.println("Gold-200000");

	}
	
	
	public static void main(String[] args) {
		ImplementationClass imp=new ImplementationClass();
		imp.carLoan();
		imp.withdrawalLimit();
		imp.mandatoryKYC();
		imp.goldLoan();
	}
	
	

}
