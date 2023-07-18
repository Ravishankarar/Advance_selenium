package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	@FindBy(xpath="//a[text()='login']")
	private WebElement loginbtn;
	public Pom1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clicklogin()
	{
		loginbtn.click();
	}
}
