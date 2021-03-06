package test_scripts;

import java.util.List;

import generic_methods.Excel;
import generic_methods.Generic_TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pom.Gmail_Compose;
import pom.Gmail_Homepage;
import pom.Gmail_LoginPage_Pwd;
import pom.Gmail_LoginPage_Username;
import pom.Gmail_SentItemCount;
import pom.Gmail_Sentpage;



public class Test_CountSentItems extends Generic_TestClass  
{
	@Test
	public void Testlogin() throws InterruptedException
	{
		//Usename Login
		String un=Excel.getdata("Sheet1", 1, 0);////fetch data from excel
		Gmail_LoginPage_Username lp_un=new Gmail_LoginPage_Username(driver);
		lp_un.setUname(un);
		Thread.sleep(2000);
		lp_un.clickNext();
		Thread.sleep(3000);
		//Password login page
		String pwd=Excel.getdata("Sheet1", 1, 1);//fetch data from excel
		Gmail_LoginPage_Pwd lp_pwd=new Gmail_LoginPage_Pwd(driver);
		lp_pwd.setPwd(pwd);
		Thread.sleep(2000);
		lp_pwd.clickNext();
		Thread.sleep(3000);
		//Compose
		Gmail_Compose cp=new Gmail_Compose(driver);
		Thread.sleep(3000);
		cp.composeclick();
		//Send to 
		Gmail_Sentpage cs	=new Gmail_Sentpage(driver);
		Thread.sleep(3000);
		cs.sendtext("reshmarajendran42@gmail.com");
		Thread.sleep(3000);
		//Send subject
		cs.sendsubject("Hello");
		Thread.sleep(3000);
		//Send body
		cs.sendbody("helloo11");
		Thread.sleep(3000);
		//click action
		cs.sendclick();
		//Sent items
		Gmail_SentItemCount gs=new Gmail_SentItemCount(driver);
		Thread.sleep(3000);
		gs.sentclick();
		
		List<WebElement> links = driver.findElements(By.tagName("//a"));
		int count=links.size();
		System.out.println(count);
		
		for(WebElement we:links)
		{
			String Text=we.getText();
			System.out.println(Text);
		}
		//Logout
		Gmail_Homepage hp=new Gmail_Homepage(driver);
		hp.iconclick();
		Thread.sleep(2000);
		hp.logoutclick();
		
		
	}
}
