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
	
	@FindBy(id="room_nos")
	private WebElement dropdown3;
	
	@FindBy(id="adult_room")
	private WebElement dropdown4;
	
	@FindBy(id="child_room")
	private WebElement dropdown5;
	
	
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


	public WebElement getDropdown3() {
		return dropdown3;
	}


	public WebElement getDropdown4() {
		return dropdown4;
	}


	public WebElement getDropdown5() {
		return dropdown5;
	}


	public WebElement getBtnsubmit() {
		return btnsubmit;
	}
	
	
public void search (String location, String hotels, String RoomType, String noofRooms, String adultsperRoom, String childrenperRoom) {
	
	type(getDropdown(), location);
	type(getDropdown1(), hotels);
	type(getDropdown2(), RoomType);
	type(getDropdown3(),noofRooms);
	type(getDropdown4(),adultsperRoom);
	type(getDropdown5(),childrenperRoom);
	btnClick(getBtnsubmit());
	
	
	
}



	
}



	


