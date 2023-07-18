package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dragbrowserfb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.navigate().to("https://www.facebook.com");
	    Thread.sleep(2000);
	 Point p=new Point(200,300);
	    driver.manage().window().setPosition(p);

	}

}
