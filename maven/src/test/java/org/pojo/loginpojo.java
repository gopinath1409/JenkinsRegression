package org.pojo;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpojo extends BaseClass {
	
	
	public loginpojo() {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id = "username")
	private WebElement txtusername;
	
	
	@FindBy(id="password")
	private WebElement txtpassword;
	
	@FindBy(id="login")
	private WebElement btnlogin;
	

	public WebElement gettxtusername() {
		return txtusername;
	}

	public WebElement txtpassword() {
		return txtpassword;
	}

	public WebElement getbtnlogin() {
		return btnlogin;
	
		
	
	}
	
}
