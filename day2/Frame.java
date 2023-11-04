package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://leafground.com/frame.xhtml;jsessionid=node05us3gij8ed091h38fieurov685953.node0");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.switchTo().frame(0);
		 driver.findElement(By.xpath("//button[@id='Click']")).click();

		

		
		 
		 
		 
		 
		
		

	}

}
