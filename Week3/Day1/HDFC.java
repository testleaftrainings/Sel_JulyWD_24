package week3.day1;

public class HDFC implements RBI {

	@Override
	public void mandatoryKYC() {
		System.out.println("Driving License");
		
	}

	@Override
	public void withdrawalLimit() {
		System.out.println("20000");
		
	}
	
	public static void main(String[] args) {
		HDFC hd=new HDFC();
		hd.mandatoryKYC();
		hd.withdrawalLimit();
	}
	

}
