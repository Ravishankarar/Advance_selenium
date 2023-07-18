package selenium;


import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo
{
public static void main(String[] args)
{
	String key="webdriver.gecko.driver";
	String value="./saftware/geckodriver.exe";
	System.setProperty(key, value);
	FirefoxDriver driver=new FirefoxDriver();
			
			
}
}
