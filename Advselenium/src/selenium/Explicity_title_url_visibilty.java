package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicity_title_url_visibilty {

	

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
         driver.get("https://www.facebook.com");
         driver.manage().window().maximize();
        
         driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9686917843");
         driver.findElement(By.xpath("//input[@type='password']")).sendKeys("r@vi1791989");
        driver.findElement(By.xpath("//button[@name='login']")).click();
        WebDriverWait wait=new  WebDriverWait(driver,10);
       // wait.until(ExpectedConditions.titleContains("facebook"));
        //String title=driver.getTitle();
      //  System.out.println(title);
      //  wait.until(ExpectedConditions.urlContains("www.facebook.com"));
        //String url = driver.getCurrentUrl();
        //System.out.println(url);
         wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Friends']")))).click();
      
       
        		}

}