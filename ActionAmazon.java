package week4.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionAmazon{

	public static void main(String[] args) throws InterruptedException {
		
		//1. Load the URL (https://www.amazon.in/)
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//2. Search for "oneplus 9 pro".
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//3. Get the price of the first product.
		String price =  driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		double phonePrice = Double.parseDouble(price.replace(",", ""));
		
		//4. Print the number of customer ratings for the first displayed product.
		String numberOfCustomerRatings = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println(numberOfCustomerRatings);
		
		//5. Click the first text link of the first image.
		driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
		
		//6. Take a screenshot of the product displayed. -----------------> (Yet to Implement)
		
		//7. Click the 'Add to Cart' button after switching window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowsList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowsList.get(1));
		driver.findElement(By.id("add-to-cart-button")).click();
	
		//8. Get the cart subtotal and verify if it is correct.
		Thread.sleep(3000);
		String checkOutPrice = driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
		double finalPrice = Double.parseDouble(checkOutPrice.replace(",", ""));
		
		if(phonePrice == finalPrice) {
			
			System.out.println("The checkout price is matching");
		}else {
			
			System.out.println("The checkout price is not-matching");
		}
		
		//9. Close the browser.
		driver.quit();
		
			

	}

}
