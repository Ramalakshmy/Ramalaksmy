package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TataCliq {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.tatacliq.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement brand = driver.findElement(By.xpath("//div[text()='Brands']"));
		
		Actions builder=new Actions(driver);
		
		builder.moveToElement(brand).perform();
		
		 WebElement watch = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		 
		 builder.moveToElement(watch).perform();
		 
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		
		WebElement sort = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		
		Select drop1=new Select(sort);
		
		drop1.selectByIndex(2);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='CheckBox__base'])[1]")).click();
		
		driver.findElement(By.xpath("(//div[@class='ProductModule__imageAndDescriptionWrapper'])[1]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> Istwindow=new ArrayList<String>();
		
		driver.switchTo().window(Istwindow.get(1));
		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//div[@class='ProductModule__imageAndDescriptionWrapper'])[1]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
