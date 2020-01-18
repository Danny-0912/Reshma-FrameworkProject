package generic_methods;

import org.openqa.selenium.WebDriver;

public class WebDriver_Methods 
{
	public String getTitle(WebDriver driver)
	{
		String title=driver.getTitle();
		System.out.println(title);
		return title;
	}
	public String getCurrentUrl(WebDriver driver)
	{
		String url=driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
	
}
