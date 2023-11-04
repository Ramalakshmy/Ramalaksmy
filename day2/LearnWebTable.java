package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		// Create obj for ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        // Load the url
        driver.get("https://erail.in/");
        // max my window
        driver.manage().window().maximize();
        // add the wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Step:1-Launch the url (https://erail.in/)
        // Step:2-Enter From as MAS
        WebElement fromsta = driver.findElement(By.id("txtStationFrom"));
        fromsta.clear();
        fromsta.sendKeys("MAS", Keys.ENTER);
        // Step:3-Enter To as MDU
        WebElement toSta = driver.findElement(By.id("txtStationTo"));
        toSta.clear();
        toSta.sendKeys("MDU",Keys.ENTER);
        // Step:4-Uncheck sort on Date
        driver.findElement(By.id("chkSelectDateOnly")).click();
        List<WebElement> rowcount = driver.findElements(By.tagName("tr"));
        System.out.println("Row count"+rowcount.size());
        WebElement columncount = driver.findElement(By.tagName("th"));
        System.out.println("Column count"+ columncount.getSize());
        String text = driver.findElement(By.xpath("//div[@id='divTrainsList']/table//tr[\"+i+\"]/th[\"+i+\"]")).getText();
        System.out.println(text);
        
        
        
        
      

		
		
	}

}
