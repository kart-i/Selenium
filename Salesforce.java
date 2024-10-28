package week5.assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Salesforce extends ProjectSpecificMethod {
	
	@Test
	public void createLegalEntity() throws InterruptedException {
		
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
			
			WebElement locationsWE = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", locationsWE);
			
			Thread.sleep(2000);
			locationsWE.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@data-key='chevrondown'])[4]")).click();
			
			Thread.sleep(3000);
			WebElement legalEntityWE = driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
			js.executeScript("arguments[0].click();", legalEntityWE);
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Karthik");
			driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
			driver.findElement(By.xpath("(//textarea[@part='textarea'])[2]")).sendKeys("SalesForces");
			
			WebElement statusWE = driver.findElement(By.xpath("//div[@class='slds-combobox_container']"));
			System.out.println(statusWE.isDisplayed());
			
			js.executeScript("arguments[0].scrollIntoView(true);",statusWE);
			statusWE.click(); 
			driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Active']")).click();
			driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
			
	
			
	}
	
	
}


