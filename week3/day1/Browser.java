package week3.day1;


//Inheritance

public class Browser {
	
	String browserName;
	double browserVersion;
	
	public void openURL(){
		System.out.println("The URL is Opened");
			
	}
	
	public void closeBrowser() {
		System.out.println("The browser is closed");
		
	}

	public void navigateBack() {
		
		System.out.println("Navigated back");
	}
	
	
	public static void main(String[] args) {
		
		Browser browserObj = new Browser();
		browserObj.openURL();
		browserObj.navigateBack();
		browserObj.closeBrowser();
			
	}

}
