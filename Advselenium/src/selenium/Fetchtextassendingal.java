package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fetchtextassendingal {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/r.php");
	    Thread.sleep(2000);
	   WebElement ele = driver.findElement(By.id("month"));
	   Select s= new  Select(ele);
	   ArrayList<String> l=new  ArrayList<String>();
	   List<WebElement> opt = s.getOptions();
	   int count=opt.size();
	   System.out.println(count);
	   for (WebElement we : opt)
	   {
		  String text = we.getText();
		  l.add(text);
	}
	   Collections.sort(l);
	   for(String l1:l)
	   {
		   System.out.println(l1);
	   }

	}

}
