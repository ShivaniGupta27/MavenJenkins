package com.qa.sut.testClasses;

import org.testng.annotations.Test;

import com.qa.sut.pages.PIM.OptionalFieldsPage;

public class OptionalFieldsTest extends ConfigurationTest {
	OptionalFieldsPage op=new OptionalFieldsPage(driver);
	
	@Test
	public void edit()
	{
		op.clickEditBtn();
		op.selectCheckBox();
		op.clickSaveBtn();
	}

}
