package week3.day2;

public abstract class CanaraBank implements Payments{

	public void cashOnDelivery() {
		System.out.println("Cash on Delivery is accepted");
		
	}
	
	public void upiPayments() {
		
		System.out.println("Upi payment is accepted");
	}

	public void cardPayments() {
		System.out.println("Card method is accepted");
		
	}

	public void internetBanking() {
		
		System.out.println("Internet banking is accepted");
	}
	
	public abstract void recordPaymentDetails();
	
	

}
