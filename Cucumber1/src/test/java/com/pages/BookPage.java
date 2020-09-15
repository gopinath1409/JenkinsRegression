package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class BookPage extends LibGlobal{
	public BookPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement txtFirstname;
	
	@FindBy(id="last_name")
	private WebElement txtLastname;
	
	@FindBy(id="address")
	private WebElement txtaddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCreditcard;
	
	@FindBy(id="cc_type")
	private WebElement dropdown1;
	
	@FindBy(id="cc_exp_month")
	private WebElement dropdown2;
	
	@FindBy(id="cc_exp_year")
	private WebElement dropdown3;
	
	@FindBy(id="cc_cvv")
	private WebElement txtccv;

	@FindBy(id="book_now")
	private WebElement btnBook;

	public WebElement getTxtFirstname() {
		return txtFirstname;
	}

	public WebElement getTxtLastname() {
		return txtLastname;
	}

	public WebElement getTxtaddress() {
		return txtaddress;
	}

	public WebElement getTxtCreditcard() {
		return txtCreditcard;
	}

	public WebElement getDropdown1() {
		return dropdown1;
	}

	public WebElement getDropdown2() {
		return dropdown2;
	}

	public WebElement getDropdown3() {
		return dropdown3;
	}

	public WebElement getTxtccv() {
		return txtccv;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}

}
