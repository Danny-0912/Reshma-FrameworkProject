package generic_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;

public class WebElement_Methods 
{
	public String gettext(WebElement ele)
	{
		String text=ele.getText();
		System.out.println(text);
		return text;
	}
	public String getAttribute(WebElement ele, String att)
	{
		String rr=ele.getAttribute(att);
		System.out.println(rr);
		return rr;
	}
	public String getTagName(WebElement ele)
	{
		String tag=ele.getTagName();
		System.out.println(tag);
		return tag;
	}
	public Point getLocation(WebElement ele)
	{
		Point Loc=ele.getLocation();
		System.out.println(Loc);
		return Loc;
	}
	public Rectangle getRect(WebElement ele)
	{
		Rectangle rect=ele.getRect();
		System.out.println(rect);
		return rect;
	}
	public Rectangle findElement(WebElement ele)
	{
		Rectangle rect=(Rectangle) ele.findElement(By.xpath("a"));
		System.out.println(rect);
		return rect;
	}
	
	
}
