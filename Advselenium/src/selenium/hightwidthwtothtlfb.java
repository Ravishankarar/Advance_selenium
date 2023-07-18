package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hightwidthwtothtlfb {

	public static void main(String[] args) throws InterruptedException
	{System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com");
    Thread.sleep(2000);
    WebElement ele=driver.findElement(By.id("pass"));
    int h=ele.getSize().getHeight();
    System.out.println(h);
    int w=ele.getSize().getWidth();
    System.out.println(w);
		

	}

}
