package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SearchPage extends LibGlobal {

	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement dropdown;
	
	@FindBy(id="hotels")
	private WebElement dropdown1;
	
	@FindBy(id="room_type")
	private WebElement dropdown2;
	
	@FindBy(id="Submit")
	private WebElement btnsubmit;

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getDropdown1() {
		return dropdown1;
	}

	public WebElement getDropdown2() {
		return dropdown2;
	}

	public WebElement getBtnsubmit() {
		return btnsubmit;
	}
}

