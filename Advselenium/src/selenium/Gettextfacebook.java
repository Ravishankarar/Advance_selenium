package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettextfacebook {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
         driver.get("https://www.facebook.com");
         Thread.sleep(2000);
        WebElement ele= driver.findElement(By.xpath("//a[@title='Kannada']"));
        String text=ele.getText();
        System.out.println(text);
         
         

	}

}
