package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccounts {

	public static void main(String[] args) {
		ChromeDriver driver  = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		// Enter Credentials
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
				
		// login
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// Create Accounts
		driver.findElement(By.linkText("Accounts"));
		driver.findElement(By.xpath("(//input[@name ='accountName'])[1]")).sendKeys("Karthi");
		WebElement countryCode = driver.findElement(By.xpath("(//input[@name ='primaryPhoneCountryCode'])[1]"));
		countryCode.clear();
		countryCode.sendKeys("+91");
		driver.findElement(By.xpath("(//input[@name ='primaryPhoneNumber'])[1]")).sendKeys("9234567890");
		driver.findElement(By.xpath("(//input[@name ='primaryEmail'])[1]")).sendKeys("accounts@gmail.com");
		driver.findElement(By.xpath("(//button[@class= 'x-btn-text'])[2]")).click();
	
	}

}
