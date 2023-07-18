package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imagesrsamzn {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.amazon.com");
	    Thread.sleep(2000);
	    List<WebElement> links = driver.findElements(By.xpath("//img"));
	    int count=links.size();
	    System.out.println(count);
	    for (WebElement we : links)
	    {
	    	String t = we.getAttribute("src");
	    	System.out.println(t);
		}

	}

}
