package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.leafground.com/alert.xhtml");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
	Alert alert = driver.switchTo().alert();
	String msg = alert.getText();
	System.out.println(msg);
	alert.sendKeys("Testleaf");
	alert.accept();
	
}
}
