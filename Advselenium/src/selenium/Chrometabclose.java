package selenium;

import org.openqa.selenium.chrome.ChromeDriver;


public class Chrometabclose
{


public static void main(String[] args) throws InterruptedException
{
	
	System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
      Thread.sleep(2000);
	
      driver.close();	
}
}
