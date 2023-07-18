package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaptheaddres {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	     driver.get("file:///D:/shankar.html");
	   WebElement ele=driver.findElement(By.id("a1"));
	   WebElement ele1=driver.findElement(By.id("a2"));
	   WebElement ele2=driver.findElement(By.id("a3"));
	   ele.sendKeys(Keys.CONTROL+"ax");
	   ele2.sendKeys(Keys.CONTROL+"v");
	   ele1.sendKeys(Keys.CONTROL+"ax");
	   ele.sendKeys(Keys.CONTROL+"v");
	   ele2.sendKeys(Keys.CONTROL+"ax");
	   ele1.sendKeys(Keys.CONTROL+"v");
	   

	}

}
