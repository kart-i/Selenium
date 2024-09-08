package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebookLogin {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); // open facebook
		
		driver.manage().window().maximize(); // maximize window
		
		WebElement element = driver.findElement(By.id("email")); // find Email text box
		
		element.sendKeys("testleaf.2023@gmail.com"); //enter Email Id
		
		driver.findElement(By.id("pass")).sendKeys("Tuna@321"); // enter password

		driver.findElement(By.name("login")).click(); // click login button
		
		//driver.findElement(By.linkText("Find your account and log in.")).click();
		//String title = driver.getTitle();
	
	}

}
