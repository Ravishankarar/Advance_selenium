package advnceseltest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_script {
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
		 driver=new ChromeDriver();
         driver.get("https://www.facebook.com");
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