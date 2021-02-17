package com.qa.sut.testClasses;

import static com.qa.sut.utility.ReadConfigProp.readProp;

import org.testng.annotations.Test;

import com.qa.sut.pages.HomePage;
import com.qa.sut.pages.PIM.ConfigurationPage;

public class ConfigurationTest extends BaseTest {
	
	HomePage hp=new HomePage(driver);
	ConfigurationPage cp=new ConfigurationPage(driver);
	
	@Test(enabled =true)
	public void search() throws InterruptedException
	{
		String uname=readProp("admin_username");
		String pwd=readProp("admin_pwd");
		cp=lp.loginWithValidCred(uname,pwd);
		Thread.sleep(5000);
		
		//System.out.println("hp is"+hp);
		//System.out.println("cp is"+cp);
		System.out.println("in search page*******     "+driver);
		cp.clickOnPim();
		cp.searchByEmpStatus();
		
	}

}
