package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']")).click();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']")).click();
		System.out.println(driver.getTitle());
		Set<String>handles=driver.getWindowHandles();
		List<String>firstWindow=new ArrayList<String>(handles);
		driver.switchTo().window(firstWindow.get(0));
		driver.close();
		
			
		}
		
		
		
			
		}
	


