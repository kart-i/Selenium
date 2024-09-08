package week2.day1;

public class Browser {
	
	public String launchBrowser(String browserName) {
		
		System.out.println("Browser Launched Sucessfully");
		return browserName;
	}
	
	public String loadUrl() {
		
		String url = "Application URL loaded successfully";
		return url;
		
	}

	public static void main(String[] args) {
		
		Browser obj = new Browser();
		System.out.println(obj.launchBrowser("Google Chrome"));
		System.out.println(obj.loadUrl());
		
	}	

}


