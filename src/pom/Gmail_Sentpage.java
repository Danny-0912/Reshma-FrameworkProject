package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_Sentpage 
{
	
	@FindBy(xpath="//textarea[@name='to']")
	private WebElement senttext;
	@FindBy(xpath="//input[@name='subjectbox']")
	private WebElement subject;
	@FindBy(xpath="//div[@role='textbox']")
	private WebElement body;
	
	@FindBy(xpath="//div[.='Send']")
	private WebElement send;
	
	public Gmail_Sentpage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void sendtext(String st)
	{
		senttext.sendKeys(st);
	}
	public void sendsubject(String st1)
	{
		subject.sendKeys(st1);
	}
	public void sendbody(String st1)
	{
		body.sendKeys(st1);
	}
	public void sendclick()
	{
		send.click();
	}
}
