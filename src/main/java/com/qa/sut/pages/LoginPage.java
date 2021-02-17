package com.qa.sut.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.sut.pages.PIM.ConfigurationPage;

public class LoginPage extends Page{
	
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		System.out.println("in login page, driver is***         "+driver);
	}
	private By userName=By.id("txtUsername");
	private By password=By.id("txtPassword");
	private By loginBtn=By.id("btnLogin");
	
	public WebElement getUNameTxtFld()
	{
		return getElement(userName);
	}
	
	public WebElement getPwdTxtFld()
	{
		return getElement(password);
	}
	
	
	public WebElement getLoginBtn()
	{
		return getElement(loginBtn);
	}
	
	
	/*public HomePage loginWithValidCred(String uname,String pwd)
	{
		getUNameTxtFld().sendKeys(uname);
		getPwdTxtFld().sendKeys(pwd);
		getLoginBtn().click();
		return new HomePage(driver);
	}*/
	
	public ConfigurationPage loginWithValidCred(String uname,String pwd)
	{
		getUNameTxtFld().sendKeys(uname);
		getPwdTxtFld().sendKeys(pwd);
		getLoginBtn().click();
		return new ConfigurationPage(driver);
	}
	/*public static void main(String[] args) {
		LoginPage lp=new LoginPage();
		lp.getPageTitle();
		lp.getElement();
	}*/

}
