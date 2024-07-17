package week1.day3;

public class LearnAccessModifier1 {
	
	public void depositAmount() {
		System.out.println("depositAmount");

	}
	
	void atmPIN() {
	System.out.println("ATM Pin");
	}
	
	    public static void main(String[] args) {
		LearnAccessModifier1 acc=new LearnAccessModifier1();
		acc.depositAmount();
		acc.atmPIN();

	}

}
