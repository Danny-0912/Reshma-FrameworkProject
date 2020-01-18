package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_Homepage {

	@FindBy(xpath="(//a[@role='button'])[3]")
	private WebElement icon;
	
	@FindBy(xpath="//a[.='Sign out']")
	private WebElement logout;
	
	public Gmail_Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void iconclick()
	{
		icon.click();
	}
	public void logoutclick()
	{
		logout.click();
	}
	
	
}
