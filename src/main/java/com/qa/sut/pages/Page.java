package com.qa.sut.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page extends BasePage{
	public Page(WebDriver driver)
	{
		super(driver);
	}

	@Override
	public WebElement getElement(By locator) {
		System.out.println("in getelement"+locator+"   driver is   "+driver);
		WebElement pageElement=driver.findElement(locator);
		//System.out.println("page element is:"+pageElement);
		return pageElement;
	}

}
