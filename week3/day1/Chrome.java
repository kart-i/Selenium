package week3.day1;

public class Chrome extends Browser {
	
	public void openIncognito(){
		System.out.println("You are in Incognito mode");
		
	}
	
	public void clearCache() {
		System.out.println("The Cache is cleared");
		
	}

	public static void main(String[] args) {
		
		Chrome chromeObj = new Chrome();
		
		System.out.println(chromeObj.browserName = "Chrome");
		System.out.println(chromeObj.browserVersion = 1.0);
		
		chromeObj.openIncognito();
		chromeObj.openURL();
		chromeObj.navigateBack();
		chromeObj.clearCache();
		chromeObj.closeBrowser();
		
		
		

	}

}
