package generic_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Generic_TestClass implements Framework_constants{
	public WebDriver driver;
	public ExtentReports rep;
	public ExtentTest test;
	
	@BeforeMethod
	public void OpenApp()
	{
		System.setProperty(GECKO_Key,GECKO_Value);
		driver=new FirefoxDriver();
		driver.get(URL);
		
		rep=new ExtentReports("./reports/r1.html/",false);
		test=rep.startTest("testscript1");
	}
	
	@AfterMethod
	public void CloseApp(ITestResult res) throws InterruptedException
	{
		int stat=res.getStatus();
		System.out.println(stat);
		String tcname=res.getName();
		System.out.println(tcname);
		if(stat==1){
			test.log(LogStatus.PASS, "TC is pass");
		}
		else if(stat==2)
		{
		String path1 = Generic_Sreenshot.getPhoto(driver,tcname);
			test.log(LogStatus.FAIL,test.addScreenCapture(path1) );
		}
		else{
			test.log(LogStatus.SKIP, "TC is skip");
		}
		Thread.sleep(3000);
		rep.endTest(test);
		
		rep.flush();
		driver.quit();
	}
	


	
	
	
	
	

}