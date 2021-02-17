package com.qa.sut.testClasses;

import static com.qa.sut.utility.ReadConfigProp.readProp;

import org.testng.annotations.Test;

import com.qa.sut.pages.HomePage;

public class HomeTest extends BaseTest{
	HomePage hp=new HomePage(driver);
	
	@Test
	public void verifyLogout() throws InterruptedException
	{
		String uname=readProp("admin_username");
		String pwd=readProp("admin_pwd");
		//hp=lp.loginWithValidCred(uname,pwd);
		Thread.sleep(5000);
		hp.logOut();
	}

}
