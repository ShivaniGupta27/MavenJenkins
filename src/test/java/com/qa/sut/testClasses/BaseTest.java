package com.qa.sut.testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.sut.pages.LoginPage;
import com.qa.sut.pages.PIM.ConfigurationPage;
import com.qa.sut.pages.PIM.OptionalFieldsPage;
import com.qa.sut.utility.ReadConfigProp;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {

	static WebDriver driver;
	LoginPage lp;
	ConfigurationPage cp;
	OptionalFieldsPage op;
	@Test(enabled=false)
	public void launchBrowser()
	{
		String browserName=ReadConfigProp.readProp("browser");
		String appUrl=ReadConfigProp.readProp("appUrl");
		System.out.println(appUrl);
		Assert.assertEquals("Firefox", browserName);
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get(appUrl);
		lp=new LoginPage(driver);
		cp=new ConfigurationPage(driver);
	}
	
	@Test
	public void launchBrowserChrome()
	{
		String browserName=ReadConfigProp.readProp("browser");
		String appUrl=ReadConfigProp.readProp("appUrl");
		System.out.println(appUrl);
		Assert.assertEquals("Chrome", browserName);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(appUrl);
		lp=new LoginPage(driver);
		cp=new ConfigurationPage(driver);
		op=new OptionalFieldsPage(driver);
	}
	
}
