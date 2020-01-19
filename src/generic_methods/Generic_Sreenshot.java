package generic_methods;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generic_Sreenshot implements Framework_constants{
	public static String getPhoto(WebDriver driver,String tcname)
	{
		Date d=new Date();
		String d1=d.toString();
		String date=d1.replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(PHOTOS+date+tcname+".jpeg");
		String path=dest.getAbsolutePath();
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;
	}
	
	

}
