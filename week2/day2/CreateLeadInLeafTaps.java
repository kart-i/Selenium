package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadInLeafTaps {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		// Enter Credentials
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// login
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);
		
		// Enter Company name, First name and Last name
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Facebook");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthik");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jai");
		
		// Select source dropdown
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceDropdown = new Select(source);
		sourceDropdown.selectByIndex(1);
		
		// select  campaign dropdown
		WebElement marketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingCampaignDropdown = new Select(marketingCampaign);
		marketingCampaignDropdown.selectByValue("CATRQ_AUTOMOBILE");
		
		// select industry dropdown
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industryDropdown = new Select(industry);
		industryDropdown.selectByVisibleText("Aerospace");
		
//		// submit and get lead name
//		driver.findElement(By.className("smallSubmit")).click();
//		String leadName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
//		System.out.println(leadName);
//		
//		// print page title
//		String pageTitle = driver.getTitle();
//		System.out.println(pageTitle);
				
	}

}
