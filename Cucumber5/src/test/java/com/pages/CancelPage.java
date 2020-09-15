package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class CancelPage extends LibGlobal {
	public CancelPage() {
		PageFactory.initElements(driver, this);
	
	}
	
@FindBy(linkText="Booked Itinerary")
private WebElement btnClick;

@FindBy(id="order_id_text")
private WebElement txtorderid;

@FindBy(id="btn_id_347597")
private WebElement btnClick1;

public WebElement getBtnClick() {
	return btnClick;
}

public WebElement getTxtorderid() {
	return txtorderid;
}

public WebElement getBtnClick1() {
	return btnClick1;
}



	
	
	
}
