package week2.assignments;

import org.openqa.selenium.By;

public class createLead {

	public static void main(String[] args) throws InterruptedException {
		
		createAccount obj = new createAccount();
		obj.loginToLeafTaps();
		
		createAccount.driver.findElement(By.linkText("Leads")).click();
		createAccount.driver.findElement(By.linkText("Create Lead")).click();
		
		createAccount.driver.findElement(By.id("createLeadForm_firstName")).sendKeys("kiki");
		createAccount.driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kiki");
		createAccount.driver.findElement(By.id("createLeadForm_companyName")).sendKeys("kik&co");
		createAccount.driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Title");
		
		createAccount.driver.findElement(By.xpath("//input[@name ='submitButton']")).click();
		
		Thread.sleep(2000);
		String pageTitle = createAccount.driver.getTitle();
		System.out.println(pageTitle);
		if(pageTitle.equals("View Lead | opentaps CRM")) {
			System.out.println("Test Case - Verify page title - Pass");	
		}
		else {
			System.out.println("Test Case - Verify page title - Failed");
			
		}
			
	}

}
