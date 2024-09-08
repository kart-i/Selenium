package week3.assignments;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//button[@class='rilrtl-button']")).click();
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		Thread.sleep(3000);
		WebElement textWE = driver.findElement(By.xpath("//strong[text()=' Items Found']"));
		System.out.println(textWE.getText());
		
		Thread.sleep(3000);
		List<WebElement> brandWES = driver.findElements(By.xpath("//div[@class='brand']"));
		List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
		
		int size = brandWES.size();
		
		for(int i=0;i<size;i++) {
			
			String brandName = brandWES.get(i).getText();
			String bagName = bagNames.get(i).getText();
			
			System.out.println(brandName+"-"+bagName);
						
	    }	
		
	}

}