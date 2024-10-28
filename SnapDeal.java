package week4.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		
		//1. Launch (https://www.snapdeal.com/)
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//2. Go to "Men's Fashion".
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("(//span[@class='catText'])[1]"))).perform();
		
		driver.findElement(By.xpath("(//span[@class='linkTest'])[1]")).click();
		
		//4. Get the count of sports shoes.
		String count = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println(count);
		
		//5. Click on "Training Shoes".
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
		//6. Sort the products by "Low to High"
		driver.findElement(By.xpath("//div[@class=\"sort-selected\"]")).click();
		driver.findElement(By.xpath("(//li[@data-index='1'])[2]")).click();
		
		// 7.Check if the displayed items are sorted correctly
		Thread.sleep(2000);
		List<WebElement> listWES = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		List<Integer> sortedPriceList = new ArrayList<Integer>();
		for(WebElement value:listWES) {
			
			String priceInString= value.getText(); //"Rs. 428"
			String replacedString = priceInString.replaceAll("[^0-9]", ""); // replacing text using regex
			int price = Integer.parseInt(replacedString);
			sortedPriceList.add(price);
					
			}
		if(sortedPriceList.size()>0) {
			
			for(int i=0;i<sortedPriceList.size()-1;i++) {
				if(!(sortedPriceList.get(i+1)>=sortedPriceList.get(i))){
					System.out.println("Not sorted from Low to High");
					break;
				}
			}
			System.out.println(sortedPriceList);
		}
		
		//8.Select any price range ex:(500-700).
		action.scrollToElement(driver.findElement(By.xpath("(//div[@class='filter-type-name lfloat'])[4]"))).perform();
		
		WebElement from = driver.findElement(By.xpath("//input[@name='fromVal']"));
		from.clear();
		from.sendKeys("500");
		
		WebElement to = driver.findElement(By.xpath("//input[@name='toVal']"));
		to.clear();
		to.sendKeys("700");
		
		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
		Thread.sleep(2000);
		
		//9. Filter by any colour.
		action.scrollToElement(driver.findElement(By.xpath("(//div[@class='filter-type-name lfloat'])[4]"))).perform();
		driver.findElement(By.xpath("(//div[@class='sdCheckbox filters-list '])[2]/label")).click();
		
		//10. Verify all the applied filters.
		List<WebElement> whiteAndBlueShoesList = driver.findElements(By.xpath("//p[@class='product-title']"));
		for(WebElement value:whiteAndBlueShoesList) {
			
			String fullShoeName = value.getText();
			
			if(fullShoeName.contains("Blue")||fullShoeName.contains("White")) {
				
				System.out.println("The White and Blue Colour filter match the products in the list ");
			}
			else {
				System.out.println("Colour filter doesn't match the products in the list");
			}
		 }
		
		//11. Mouse hover on the first resulting "Training Shoes".
		action.moveToElement(driver.findElement(By.xpath("(//div[@class='product-tuple-image '])[1]"))).perform();	
		
		//12. Click the "Quick View" button.
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(text(),'Quick View')])[1]")).click();
		
		//13. Print the cost and the discount percentage.
		System.out.println(driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText());
		System.out.println(driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText());
			
	  }
}


