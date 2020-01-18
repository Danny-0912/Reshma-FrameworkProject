package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_LoginPage_Username {
	//Declaration
	@FindBy(id="identifierId")
	private WebElement Untbox;
	
	@FindBy(xpath="//div[@id='identifierNext']")
	private WebElement Nextbtn;
	
	//Initialization
	public Gmail_LoginPage_Username(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void setUname(String un)
	{
		Untbox.sendKeys(un);
	}
	
	public void clickNext()
	{
		Nextbtn.click();
	}
	

}
