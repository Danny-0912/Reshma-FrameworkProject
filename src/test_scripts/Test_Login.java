package test_scripts;


import generic_methods.Excel;
import generic_methods.Generic_TestClass;

import org.testng.annotations.Test;

import pom.Gmail_Homepage;
import pom.Gmail_LoginPage_Pwd;
import pom.Gmail_LoginPage_Username;

public class Test_Login extends Generic_TestClass 
{
	@Test
	public void TestLogin() throws InterruptedException
	{
		
		//Username login page
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
		//Logout
		Gmail_Homepage hp=new Gmail_Homepage(driver);
		hp.iconclick();
		Thread.sleep(2000);
		hp.logoutclick();
	}

}

