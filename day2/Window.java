package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("FLIGHTS")).click();
		System.out.println(driver.getTitle());
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>firstWindow=new ArrayList<String>(windowHandles);
		driver.switchTo().window(firstWindow.get(0));
		driver.close();
		
		
		
		
		

	}

}
