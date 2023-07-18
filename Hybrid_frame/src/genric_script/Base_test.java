package genric_script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test implements Frame_work
{
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(chrome_key,chrome_value);
		 driver=new ChromeDriver();
         driver.get(base_url);
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
         driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9686917843");
         driver.findElement(By.xpath("//input[@type='password']")).sendKeys("r@vi1791989");
        driver.findElement(By.xpath("//button[@name='login']")).click();
         
   }

	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
}
