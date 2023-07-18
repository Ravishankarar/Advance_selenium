package advnceseltest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Runner_scipt extends Generic_script
{
@Test
public void runnerapp()
{
	driver.findElement(By.xpath("//span[text()='Friends']"));

}
@Test
public void runner()
{
	String title = driver.getTitle();
	Assert.assertEquals(title,("facebook-login") );
}
}
