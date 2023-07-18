package genric_script;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class Runner_script extends Base_test
{
	@Test
	public void runnerapp()
	{
		driver.findElement(By.xpath("//span[text()='Friends']"));

	}
	
	}

