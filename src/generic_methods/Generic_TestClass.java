package generic_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_TestClass implements Framework_constants{
	public WebDriver driver;
	
	@BeforeMethod
	public void OpenApp(){
		System.setProperty(GECKO_Key,GECKO_Value);
		driver=new FirefoxDriver();
		driver.get(URL);
		
	}
	
	@AfterMethod
	public void CloseApp() throws InterruptedException{
		Thread.sleep(3000);
		driver.quit();
	}

}