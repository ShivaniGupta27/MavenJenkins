package com.qa.sut.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends Page{
	private By welLink=By.id("welcome");
	private By logoutLink=By.xpath("//a[@href='/index.php/auth/logout']");

	public HomePage(WebDriver driver) {
		super(driver);
		System.out.println("in home page, driver is  ********        "+driver);
	}
	
	public WebElement getWelLink()
	{
		return getElement(welLink);
	}
	
	public WebElement getLogoutLink()
	{
		return getElement(logoutLink);
	}
	
	public void logOut() throws InterruptedException
	{
		getWelLink().click();
		Thread.sleep(3000);
		getLogoutLink().click();
	}

}
