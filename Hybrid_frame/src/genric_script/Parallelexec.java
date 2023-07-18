package genric_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallelexec {
	public WebDriver driver;

	@Test
	@Parameters({"browser"})
	public void exec(String browser)
	{
		System.setProperty("webdriver.chrome.driver"," ./saftware/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver"," ./saftware/geckodriver.exe");
	if(browser.equals("firefox"))
	{
		driver=new FirefoxDriver();
		driver.get("https://www.google.com");
	}
	else
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	}
}
