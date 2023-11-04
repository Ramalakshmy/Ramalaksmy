package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//mouse hover
		WebElement brands = driver.findElement(By.xpath("(//a[@class='css-1mavm7h'])[2]"));
		Actions builder=new Actions(driver);
		builder.moveToElement(brands).perform();
		driver.findElement(By.xpath("//img[@src='https://adn-static2.nykaa.com/media/wysiwyg/2019/lorealparis.png']")).click();
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("(//div[@class='filter-open css-1gdff5r'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class=' css-1nozswx'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class=' css-1nozswx'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Colour Protection']")).click();
		
	}

}
