package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownsingle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
	    driver.get("file:///D:/dropmulti.html");
	    Thread.sleep(2000);
	   WebElement ele = driver.findElement(By.id("hotel"));
	   Select s= new  Select(ele);
	   boolean b=s.isMultiple();
	   if(b)
	   {
		   System.out.println("multiple dd");
	   }
	   else
	   {
		   System.out.println("not multiple dd");
	   }
	    
	   
	}

}
