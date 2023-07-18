package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getloctionfb {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
         driver.get("https://www.facebook.com");
         Thread.sleep(2000);
        WebElement ele= driver.findElement(By.xpath("//button[@name='login']"));
   Point loc = ele.getLocation();
        System.out.println(loc);
        int x=loc.getX();
        System.out.println(x);
            int y=loc.getY();
            System.out.println(y);
	}

}
