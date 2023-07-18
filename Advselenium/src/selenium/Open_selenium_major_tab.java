package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Open_selenium_major_tab {

	
		public static void main(String[] args) throws InterruptedException, AWTException 
		{
			System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.selenium.dev/documentation/webdriver/elements/");
			 Thread.sleep(2000);
			  WebElement ele = driver.findElement(By.xpath("//span[text()='Downloads']"));
			 WebElement ele1=driver.findElement(By.xpath("//span[text()='Documentation']"));
			 WebElement ele2=driver.findElement(By.xpath("//span[text()='Projects']"));
			 ArrayList<WebElement> l=new  ArrayList<>();	
			 
				 l.add(ele);
				 l.add(ele1);
				 l.add(ele2);
			 
			 
			 Actions act=new  Actions(driver); 
			
			 Robot r=new Robot();
			 for (WebElement web : l)
			 {
			 act.contextClick(web).perform();
			 Thread.sleep(2000);
			
			 r.keyPress(KeyEvent.VK_T);
			 r.keyRelease(KeyEvent.VK_T);
			 

			 
			
			
			 }

	    }

}
