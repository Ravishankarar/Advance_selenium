package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
         driver.get("https://www.facebook.com");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9686917843");
         driver.findElement(By.xpath("//input[@type='password']")).sendKeys("r@vi1791989");
        driver.findElement(By.xpath("//button[@name='login']")).click();
        		}
}

