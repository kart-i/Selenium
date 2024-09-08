package week3.day1;

public class Safari extends Browser {
	
	public void readerMode(){
		
		System.out.println("You are in ReaderMode");
		
	}
	public void fullScreenMode() {
		
		System.out.println("You are in Full Screen Mode");
		
	}

	public static void main(String[] args) {
		
		Safari safariObj = new Safari();
		
		System.out.println(safariObj.browserName = "Safari");
		System.out.println(safariObj.browserVersion = 3.0);
		
		safariObj.openURL();
		safariObj.readerMode();
		safariObj.fullScreenMode();
		safariObj.navigateBack();
		safariObj.closeBrowser();

	}

}
