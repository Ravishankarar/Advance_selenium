package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fecth_path_of_file
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
    driver.get("file:///D:/file.html");
   
    Thread.sleep(2000);
     WebElement ele = driver.findElement(By.name("uploadfile"));
     ele.sendKeys("D:\\manual defect\\usebility testing.png");
    
}
}
