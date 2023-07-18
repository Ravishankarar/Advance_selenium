package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Demoqa_class {
	public class pom1
	{
		@FindBy(id="firstName")
		private WebElement namefaild;
		@FindBy(id="lastname")
		private WebElement lastfaild;
		@FindBy(id="Email")
		private WebElement emailfaild;
		@FindBy(xpath="[text()='male']")
		private WebElement genderfaild;
		@FindBy(id="usernumber")
		private WebElement mobilefaild;
		@FindBy(id="dateofbirth")
		private WebElement birthfaild;
		@FindBy(id="subject")
		private WebElement subfaild;
		@FindBy(xpath = "[text()='sport']")
		private WebElement sportfaild;
		@FindBy(id="currentaddress")
		private WebElement addfaild;
		public  pom1(WebDriver driver)
		{PageFactory.initElements(driver, this);
			
		}
		public void fname(String name)
		{
		namefaild.sendKeys("name");
		}
		public void fname1(String name)
		{
		lastfaild.sendKeys("name");
		}
		public void email(String name)
		{
		emailfaild.sendKeys("name");
		}
		public void gender(String name)
		{
		genderfaild.sendKeys("name");
		}
		public void mobile(String name)
		{
		mobilefaild.sendKeys("name");
	
		
	}
	}

}
	

