package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class  createAccount {
	
	static ChromeDriver driver  = new ChromeDriver();
	public String loginToLeafTaps() {
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		// Enter Credentials
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
				
		// login
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		return "Successfully logged in";
		
	}

	public static void main(String[] args) {
		
		createAccount obj = new createAccount();
		obj.loginToLeafTaps();
		// Create Account
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("kikitest");
		driver.findElement(By.xpath("//textarea[@name = 'description']")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.xpath("//input[@value ='Create Account']")).click();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		if(pageTitle.equals("Account Details | opentaps CRM")) {
			System.out.println("Test Case - Verify page title - Pass");	
		}
		else {
			System.out.println("Test Case - Verify page title - Failed");
			
		}
			
	}

}
