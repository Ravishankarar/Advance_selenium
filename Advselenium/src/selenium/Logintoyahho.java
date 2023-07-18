package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintoyahho {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
         driver.get("https://www.yahoo.com");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//a[text()='Sign in']")).click();
         driver.findElement(By.xpath("//input[@name='username']")).sendKeys("bujji199576");
         driver.findElement(By.xpath("//input[@type='submit']")).click();
         driver.findElement(By.xpath("//input[@type='password']")).sendKeys("bujji@1995");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        		}

	}


