package date_driven_test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_date {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis=new FileInputStream("./Excelfile/Book1.xlsx");
	Workbook book=WorkbookFactory.create(fis);
	 Sheet sh = book.getSheet("Sheet1");
	
	  Row r = sh.getRow(0);
	 Cell c = r.getCell(0);
	  String un = c.toString();
	 System.out.println(un);
	 
	 Cell c1 = r.getCell(1);
	 String pwd = c1.toString();
	 System.out.println(pwd);
	 
	 
	
	System.setProperty("webdriver.chrome.driver", "./saftware/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys(un);
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
   driver.findElement(By.xpath("//button[@name='login']")).click();
  
	}
    

}
