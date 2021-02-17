package com.qa.sut.pages.PIM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OptionalFieldsPage extends ConfigurationPage{

	public OptionalFieldsPage(WebDriver driver) {
		super(driver);
	}

	
	
	By editBtn=By.cssSelector("#btnSave");
	By checkBox=By.xpath("//input[@id='configPim_chkShowTax']");
	By saveBtn=By.cssSelector("#btnSave");
	
	public WebElement getEditBtn()
	{
		return getElement(editBtn);
	}
	
	public WebElement getCheckBox()
	{
		return getElement(checkBox);
	}
	
	public WebElement getSaveBtn()
	{
		return getElement(saveBtn);
	}
	
	public void clickEditBtn()
	{
		getEditBtn().click();
	}
	
	public void selectCheckBox()
	{
		getCheckBox().click();
	}
	
	public void clickSaveBtn()
	{
		getSaveBtn().click();
	}

}
