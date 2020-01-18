package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_LoginPage_Pwd {
	@FindBy(name="password")
	private WebElement Pwdtbox;
	
	@FindBy(xpath="//div[@id='passwordNext']")
	private WebElement Nextbtn;
	
	//Initialization
	public Gmail_LoginPage_Pwd(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void setPwd(String pwd)
	{
		Pwdtbox.sendKeys(pwd);
	}
	
	public void clickNext()
	{
		Nextbtn.click();
	}
	
}
