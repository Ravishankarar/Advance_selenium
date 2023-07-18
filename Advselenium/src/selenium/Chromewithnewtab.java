package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chromewithnewtab {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com");
		 Thread.sleep(2000);
		
	WebElement rclick = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
	 Thread.sleep(2000);
	 Actions act=new  Actions(driver); 
	 act.contextClick(rclick).perform();
	 Robot r=new Robot();
	 r.keyPress(KeyEvent.VK_T);
	 r.keyRelease(KeyEvent.VK_T);
	 Set<String> allwh=driver.getWindowHandles();
	 int count=allwh.size();
	 System.out.println(count);
	 
	
	 for(String wh:allwh)
	 {
		driver.switchTo().window(wh);
		String title=driver.getTitle();
		System.out.println(title);
		//driver.close();
	 }

	}

}
