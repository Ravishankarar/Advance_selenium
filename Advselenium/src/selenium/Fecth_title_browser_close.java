package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fecth_title_browser_close {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://skpatro.github.io/demo/links/");
		 Thread.sleep(2000);
		 driver.findElement(By.name("NewWindow")).click();
		 
		 Thread.sleep(2000);
		 Set<String> allwh=driver.getWindowHandles();
		 int count=allwh.size();
		 System.out.println(count);
		 for(String wh:allwh)
		 {
			driver.switchTo().window(wh);
			String title=driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
			driver.close();
		 }
		

	}

}
