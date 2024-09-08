package week3.day1;

public class Edge extends Browser {
	
	public void takeSnap(){
		
		System.out.println("The snapshot is taken");
		
	}
	public void clearCookies() {
		
		System.out.println("The Cookies are cleared");
		
	}

	public static void main(String[] args) {
		
		Edge edgeObj = new Edge();
		
		System.out.println(edgeObj.browserName = "Edge");
		System.out.println(edgeObj.browserVersion = 2.0);
		
		edgeObj.openURL();
		edgeObj.takeSnap();
		edgeObj.navigateBack();
		edgeObj.clearCookies();
		edgeObj.closeBrowser();

	}

}
