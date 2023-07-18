package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countimgamzon {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		    driver.navigate().to("https://www.amazon.com");
		    Thread.sleep(2000);
		    List<WebElement> links = driver.findElements(By.xpath("//img"));
		    int count=links.size();
		    System.out.println(count);

	}

}
