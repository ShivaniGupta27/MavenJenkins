package com.qa.sut.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

abstract public class BasePage {
	WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		
		this.driver=driver;
		System.out.println("in base page, driver is****       "+this.driver);
	}
	 public String getPageTitle()
	 {
		 String pageTitle=driver.getTitle();
		 return pageTitle;
	 }
	abstract public WebElement getElement(By locator);
}
