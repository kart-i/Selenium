package week2.marathon1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookTicket {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement cinema = driver.findElement(By.xpath("//span[text()='Cinema']"));
		cinema.click();
		WebElement cinemaWE = driver.findElement(By.xpath("//span[text()='Select Cinema']"));
		cinemaWE.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='INOX Chennai Citi Centre,Dr. R. K. Salai Chennai']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text() ='VAAZHAI'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text() ='11:45 AM']")).click();
		driver.findElement(By.xpath("//span[text()='Book']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.id("CL.Club|G:10")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(3000);
		WebElement seatNo = driver.findElement(By.xpath("//p[text()='G10']"));
		String seatNum = seatNo.getText();
		WebElement price = driver.findElement(By.xpath("(//span[text()='221.46'])[2]"));
		String totalPrice = price.getText();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		System.out.println(seatNum);
		System.out.println(totalPrice);
		driver.close();
		
	
					
	}

}
