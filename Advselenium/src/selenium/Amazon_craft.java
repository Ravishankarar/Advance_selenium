package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_craft {

	private static final String Enter = null;

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com//");
	    driver.findElement(By.xpath("//button[text()='X']")).click();
	    
	    Thread.sleep(2000);
	
	driver.findElement(By.name("text")).sendKeys("puma showes" +Enter);
	 
	}

}
