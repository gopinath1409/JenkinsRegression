package org.pojo;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectpojo extends BaseClass {
	
	public selectpojo() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="radiobutton_1")
	private WebElement radio;
	
	@FindBy (id = "continue")
	private WebElement btncontinue;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}
	
		
		

}
