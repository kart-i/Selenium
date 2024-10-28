package week4.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FinanceYahoo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://finance.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions act = new Actions(driver);
		WebElement moreWE = driver.findElement(By.xpath("(//button[@aria-label='More'])[1]"));
		act.moveToElement(moreWE).perform();
		WebElement linkText = driver.findElement(By.linkText("Privacy Policy"));
		act.scrollToElement(linkText).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@aria-label='Finance: Crypto']")).click();
		
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//tr[@class='row false  yf-42jv6g']"));
		for(int i=0;i<list.size();i++) {
			
		String text = driver.findElement(By.xpath("(//tr[@id="+i+"]/td[1]/span/div/a/div/span)[2]")).getText();
		System.out.println(text);
		
		}
	}

}
