package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromepage {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
         driver.get("https://www.facebook.com");
         Thread.sleep(2000);
         
         String src=driver.getPageSource();
         System.out.println(src);
         driver.close();
         
	}

}
