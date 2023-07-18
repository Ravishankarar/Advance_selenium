package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_division_popup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
	    driver.get("https://www.redbus.in/");
	    Thread.sleep(2000);
	 driver.findElement(By.xpath("//label[text()='Date']")).click();
	 driver.findElement(By.xpath("//td[text()='31']")).click();
	 

	}

}
