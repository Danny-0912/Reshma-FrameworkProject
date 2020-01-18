package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_Compose 
{
	
	
	@FindBy(xpath="(//div[.='Compose'])[1]")
	private WebElement compose;
	
	public Gmail_Compose (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void composeclick()
	{
		compose.click();
	}
}
