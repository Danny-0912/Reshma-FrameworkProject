package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_SentItemCount 
{
	@FindBy(xpath="//a[@title='Sent']")
	private WebElement sentitems;
	
	public Gmail_SentItemCount  (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sentclick()
	{
		sentitems.click();
	}
}
