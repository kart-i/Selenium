package week3.day2;

public class Amazon extends CanaraBank {
	
	
	public void recordPaymentDetails() {
		System.out.println("Record the Payment Details");
		
	}

	public static void main(String[] args) {
		
	Amazon obj	= new Amazon();
	obj.cardPayments();
	obj.cashOnDelivery();
	obj.upiPayments();
	obj.internetBanking();
	obj.recordPaymentDetails();
		
	}

	

}
