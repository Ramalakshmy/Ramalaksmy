package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");
		Actions snap=new Actions(driver);
		snap.moveToElement(driver.findElement(By.xpath("//span[@class='catText']"))).click();
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		String count= driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		String replace = count.replace("[^0-9]", "");
		System.out.println("Total no of shoes: "+count);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		driver.findElement(By.xpath("//li[@class='search-li']")).click();
		Thread.sleep(3000);
		
		
		
		

	}

}
