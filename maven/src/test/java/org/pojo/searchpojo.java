package org.pojo;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchpojo extends BaseClass {
	
	public searchpojo() {
		PageFactory.initElements(driver, this);
		
		
	}

	@FindBy(id ="location")
	private WebElement dropdown;
	
	@FindBy(id = "Submit")
	private WebElement btnsubmit;

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getBtnsubmit() {
		return btnsubmit;
	}
	
	
	
}
