package genric_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demoqa_genaric {
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
	}

}

