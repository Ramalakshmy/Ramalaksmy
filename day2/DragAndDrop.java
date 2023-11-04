package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions a=new Actions(driver);
		
a.dragAndDrop(driver.findElement(By.xpath("//span[@class='ui-panel-title']")), driver.findElement(By.xpath("//p[text()='Drag to target']"))).build().perform();
	}

}
