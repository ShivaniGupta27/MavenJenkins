package com.qa.sut.pages.PIM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.sut.pages.Page;

public class ConfigurationPage extends Page {
	
	public ConfigurationPage(WebDriver driver) {
		super(driver);
		System.out.println("in conig page, driver is*******         "+driver);
	}
	
	By pim=By.xpath("//a[contains(@href,'/viewPimModule')]");
	By config=By.cssSelector("#menu_pim_Configuration");
	By empStatus= By.cssSelector("#empsearch_employee_status");
	By srchBtn=By.cssSelector("#searchBtn");
	
	public WebElement getPim()
	{
		//System.out.println("in getpim");
		WebElement we=getElement(pim);
		//System.out.println("we is: "+we);
		return we;
	}
	
	public WebElement getConfig()
	{
		return getElement(config);
	}
	public WebElement getEmpStatus()
	{
		return getElement(empStatus);
	}
	public WebElement getSrchBtn()
	{
		return getElement(srchBtn);
	}
	
	public void clickOnPim()
	{
		getPim().click();
	}
	
	public void searchByEmpStatus()
	{
		Select dd=new Select(getEmpStatus());
		dd.selectByVisibleText("Full-Time Contract");
		getSrchBtn().click();
		
		
	}
	
}
