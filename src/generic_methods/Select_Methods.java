package generic_methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Select_Methods 
{
	public void SelectIndex(WebElement ele,int i) 
	{
		Select s=new Select(ele);
		s.selectByIndex(i);
	}
	public void deselectIndex(WebElement ele,int p) 
	{
		Select s=new Select(ele);
		s.deselectByIndex(p);
	}
	public void SelectValue(WebElement ele,String a) 
	{
		Select s=new Select(ele);
		s.selectByValue(a);
	}
	public void SelectByVisibleText(WebElement ele,String a) 
	{
		Select s=new Select(ele);
		s.selectByVisibleText(a);
	}
}
