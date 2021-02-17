package com.qa.sut.testClasses;

import org.testng.Assert;

//import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import static com.qa.sut.utility.ReadConfigProp.*;

public class LoginTest extends BaseTest{
	@Test(priority = 1)
	public void verifyLogin()
	{
		String uname=readProp("admin_username");
		String pwd=readProp("admin_pwd");
		lp.loginWithValidCred(uname,pwd);
	}
	@Test(priority = 0)
	public void verifyPageTitle()
	{
		String act=lp.getPageTitle();
		String exp="OrangeHRM";
		Assert.assertEquals(act, exp,"not matched");
	}
}
