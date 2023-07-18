package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtubelike
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
         driver.get("https://www.youtube.com");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//div[class='yt-spec-touch-feedback-shape__fill']")).click();
         driver.findElement(By.xpath("//div[text()='Ravi Shankar']")).click();
         
         
         driver.findElement(By.xpath("//input[@type='password']")).sendKeys("r@vi1791989");
        driver.findElement(By.xpath("//span[@type='next']")).click();
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kannadsongs");
        driver.findElement(By.xpath("//yet-icon[class='style-scope ytd-searchbox']")).click();
        driver.findElement(By.xpath("//img[@alt style='background-color: transparen']")).click();
       
        

	}

}
