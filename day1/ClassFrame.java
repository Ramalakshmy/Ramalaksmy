package week4.day1;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassFrame {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/JS/tryit.asp?filename=tryjs_confirm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		String text2 = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		alert.accept();
		System.out.println(text2);
		if (text2.contains("You pressed ok")) {
			System.out.println("Action is performed");
			
			
		}
		else {
			System.out.println("Action is not performed");
		}
		driver.switchTo().defaultContent();
		
		
		
		
	
		
		
	}

}
