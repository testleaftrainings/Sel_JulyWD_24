package week3.day1;

public abstract  class Axis implements RBI{
	
	@Override
	public void mandatoryKYC() {
		
		System.out.println("Pan Card");
		
	}
	
	//carLoan - AxisBank method
	public abstract void carLoan();
	
}
