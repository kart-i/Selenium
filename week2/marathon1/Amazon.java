package week2.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement searchResults1 = driver.findElement(By.xpath("(//div[@class='sg-col-inner']/div/span)[1]"));
		WebElement searchResults2 = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
		
		System.out.println(searchResults1.getText()+""+searchResults2.getText());
		
		
		//checkbox
		driver.findElement(By.xpath("(//li[@aria-label ='Skybags'])/span/a/div/label")).click();
		driver.findElement(By.xpath("//li[@aria-label ='Safari']/span/a/div/label")).click();
		
		WebElement Featured = driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
		Featured.click();
	
		WebElement dropWe = driver.findElement(By.xpath("//select[@id='s-result-sort-select']"));
		Select DD = new Select(dropWe);
		DD.selectByIndex(4);
		
		
		WebElement bagNameWE = driver.findElement(By.xpath("(//span[contains(@class,'a-size-base-plus a-color-base')])[1]"));
		WebElement bagDetailsWE = driver.findElement(By.xpath("(//span[contains(@class,'a-size-base-plus a-color-base')])[2]"));
		String bagName = bagNameWE.getText();
		String bagDetails = bagDetailsWE.getText();
			
		
		System.out.println(bagName+""+bagDetails);
		System.out.println(driver.getTitle());
		
		
	}

}
