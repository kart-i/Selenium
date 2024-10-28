package week5.assignments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicParameterization extends ProjectSpecificMethod {
	
	
	@Test(dataProvider = "passData")
	public void createLegalEntity(String name,String companyname,String SaasName) throws InterruptedException {
		
		WebElement appLauncherButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='App Launcher']")));
		appLauncherButton.click();
	
		WebElement viewAllWE = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='View All Applications']")));
		viewAllWE.click();
		
		WebElement legalEntitiesWE = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", legalEntitiesWE);
		wait.until(ExpectedConditions.visibilityOf(legalEntitiesWE));
		legalEntitiesWE.click();
		
		driver.findElement(By.xpath("//div[@title='New']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(companyname);
		driver.findElement(By.xpath("(//textarea[@part='textarea'])[2]")).sendKeys(SaasName);
		
		WebElement statusWE = driver.findElement(By.xpath("//div[@class='slds-combobox_container']"));
		js.executeScript("arguments[0].scrollIntoView(true);", statusWE);
		statusWE.click(); 
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Active']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
	}
	
	
//	public String[][] passData() {
//		
//		String[][] data = new String[1][3];
//		
//		data[0][0] = "Salesforce Automation by Karthi";
//		data[0][1] = "TestLeaf";
//		data[0][2] = "SalesForces";
//		
//		return data;
	
	@DataProvider(name ="passData")
	public String[][] getDataFromExcel() throws IOException {
		
		String[][] data = DataLibrary.fetchExcelData("salesforce");
		
		return data;
	}
		
	
	
}
