package week2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/"); 
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Karthi");
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Srini");
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("karthikeyannsrinivasan@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("K@2013109012");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select dayDropDown = new Select(day);
		Select monthDropDown = new Select(month);
		Select yearDropDown = new Select(year);
		
		dayDropDown.selectByValue("29");
		monthDropDown.selectByValue("8");
		yearDropDown.selectByValue("1996");
		driver.findElement(By.xpath("//input[@value ='2']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
	}

}
