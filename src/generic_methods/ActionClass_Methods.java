package generic_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ActionClass_Methods 
{
	public void moveToElement(WebDriver driver ,WebElement ele) 
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	public void doubleclick(WebDriver driver ,WebElement ele) 
	{
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
	}
	public void dragAnddrop(WebDriver driver ,WebElement ele1,WebElement ele2) 
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(ele1, ele2).perform();
	}
	public void RightClick(WebDriver driver ,WebElement ele) 
	{
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
	}
}
