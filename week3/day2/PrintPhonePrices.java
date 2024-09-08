package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPhonePrices {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> priceList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for (WebElement webElement : priceList) {
			
			System.out.println(webElement.getText());
			
		}
		
		
	}

}
