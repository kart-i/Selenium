package week4.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Thread.sleep(3000);
		
		switchWindows(driver, 1);
		driver.findElement(By.linkText("DemoCustomer")).click();
		
		switchWindows(driver, 0);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		
		switchWindows(driver, 1);
		driver.findElement(By.linkText("dp1a1contact2")).click();
		
		
		switchWindows(driver, 0);
		driver.findElement(By.linkText("Merge")).click();
		
		Alert alertBox = driver.switchTo().alert();
		alertBox.accept();
		
	
	}
	
	private static void switchWindows(ChromeDriver driver,int handleIndex) {
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowHandlesList.get(handleIndex));
	}
		 
		 		
}
	


