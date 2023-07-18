package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Was_disabled {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
	    driver.get("file:///D:/disbled.html");
	   JavascriptExecutor js=( JavascriptExecutor) driver;
	   js.executeScript("document.getElementById('a1').value='ravi'");

	}

}
