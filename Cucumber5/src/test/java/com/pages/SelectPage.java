package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SelectPage extends LibGlobal {

	public SelectPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	
	@FindBy(id="continue")
	private WebElement btncontinue;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}

		
}
