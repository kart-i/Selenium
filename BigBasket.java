package week4.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException {
		
		//1. Navigate to https://www.bigbasket.com/.
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//2. Click on "Shop by Category".
		driver.findElement(By.xpath("(//div[@class='relative h-full']//button)[2]")).click();
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		
		//3. Mouse over "Foodgrains, Oil & Masala".
		WebElement FoodGrainsWE = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		act.moveToElement(FoodGrainsWE).perform();
		
		//4. Mouse over "Rice & Rice Products".
		WebElement riceProductsWE = driver.findElement(By.xpath("(//a[text()='Rice & Rice Products'])[1]"));
		act.moveToElement(riceProductsWE).perform();
		
		//5. Click on "Boiled & Steam Rice".
		WebElement boiledWE = driver.findElement(By.xpath("(//a[text()='Boiled & Steam Rice'])[1]"));
		act.moveToElement(boiledWE).click().perform();
		
		//6. Filter the results by selecting the brand "bb Royal".
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Shop by Category']"))).perform();
		act.scrollToElement(driver.findElement(By.xpath("(//button[text()='Show more +'])[1]"))).perform();
		driver.findElement(By.id("i-BBRoyal")).click();
		
		//7. Click on "Tamil Ponni Boiled Rice".
		driver.findElement(By.xpath("//div[@id='headlessui-listbox-button-:r6u:']/button")).click();
		
		//8. Select the 5 Kg bag.
		act.scrollToElement(driver.findElement(By.xpath("//span[text()='Show more']"))).perform();	
		driver.findElement(By.xpath("//div[text()='5 kg - (12-17 Months Old)']")).click();
		
		//9. Check and note the price of the rice.
		String fiveKgBagPrice = driver.findElement(By.xpath("(//div[@class='Pricing___StyledDiv-sc-pldi2d-0 bUnUzR'])[3]/span[1]")).getText();
		
		//10. Click "Add" to add the bag to your cart
		driver.findElement(By.xpath("(//button[text()='Add'])[3]")).click();
		
		//11. Verify the success message that confirms the item was added to your cart. -----------> (DOUBT)
		
		WebElement successWE = driver.findElement(By.xpath("//div[@id='toast']//p"));
		String successMessage = successWE.getText();
		System.out.println(successWE.isDisplayed());
		
		if(successMessage.equals("An item has been added to your basket successfully")) {
			
			System.out.println(successMessage);
			
		}
		
		
		
		//12. Take a snapshot of the current page
		
	
	}

}
