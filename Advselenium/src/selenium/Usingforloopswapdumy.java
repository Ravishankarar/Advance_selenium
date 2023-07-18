package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingforloopswapdumy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("file:///D:/ravishankar.html");
        Thread.sleep(2000);
	    List<WebElement> links = driver.findElements(By.xpath("//input"));
	    int count=links.size();
	    System.out.println(count);
	    for(int i=count-1;i>=0;i--)
	    {
	    	WebElement we = links.get(i);
	     we.clear();	    }
	}

}
