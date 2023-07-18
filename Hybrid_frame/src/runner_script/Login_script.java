package runner_script;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom_script.Pom1;

public class Login_script
{
@Test
public void validlogin() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
    driver.get("https://desktop-3rfuoac/login.do");
    driver.manage().window().maximize();
    Pom1 p = new Pom1(driver);
    p.clicklogin();
    Thread.sleep(2000);
    
    
    
}
}
