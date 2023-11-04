package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;


public class ServiceGatelog {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://dev167481.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("NsIdqpM/*3T3");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Shadow dom=new Shadow(driver);
		dom.setImplicitWait(30);
		dom.findElement("//div[text()='All']");
		
		
		
		
		
		
		
		
		
		
		
	}

}
