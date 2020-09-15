package com.stepdefinition;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.base.LibGlobal;
import com.pages.BookPage;
import com.pages.LoginPage;
import com.pages.SearchPage;
import com.pages.SelectPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStep extends LibGlobal {
	LoginPage loginpage;
	SearchPage searchpage;
	SelectPage selectpage;
	BookPage bookpage;
	
	@Given("User is on the adactin page")
	public void user_is_on_the_adactin_page() throws MalformedURLException {
		driver = getDriverCloud();
		getDriver();
		loadUrl("http://adactinhotelapp.com/");
	}

	@When("User should enter {string} and {string}")
	public void user_should_enter_and(String username, String password) {
		loginpage = new LoginPage();
		type(loginpage.getTxtusername(), username);
		type(loginpage.getTxtpassword(), password);
		
	}

	@When("User should click the login button")
	public void user_should_click_the_login_button() {
		btnClick(loginpage.getBtnLogin());
		
	}

	@When("User should verify msg")
	public void user_should_verify_msg() {
		Assert.assertTrue("Verify URl", driver.getCurrentUrl().contains("adactin"));  
	}

	@When("User should Search the Hotels {string} , {string} , {string}")
	public void user_should_Search_the_Hotels(String location, String hotels, String RoomType) {
		searchpage = new SearchPage();
		type(searchpage.getDropdown(), location);
		type(searchpage.getDropdown1(), hotels);
		type(searchpage.getDropdown2(), RoomType);
	
	}

	@When("User should click the Search button")
	public void user_should_click_the_Search_button() {
		btnClick(searchpage.getBtnsubmit());
	}

	@When("User should Select the Radio button")
	public void user_should_Select_the_Radio_button() {
		selectpage = new SelectPage();
		btnClick(selectpage.getRadio());
	}

	@When("User should click the Continue button")
	public void user_should_click_the_Continue_button() {
		btnClick(selectpage.getBtncontinue());
	}

	@When("User should enter {string} , {string} , {string} , {string} , {string} , {string} , {string} ,{string}")
	public void user_should_enter(String firstname, String lastname, String billingaddress, String creditcardno, String creditcardtype, String expirydateMonth, String expirydateyear, String cvvnumber) {
		bookpage = new BookPage(); 
		
		type(bookpage.getTxtFirstname(), firstname);
		type(bookpage.getTxtLastname(), lastname);
		type(bookpage.getTxtaddress(), billingaddress);
		type(bookpage.getTxtCreditcard(), creditcardno);
		type(bookpage.getDropdown1(), creditcardtype);
		type(bookpage.getDropdown2(), expirydateMonth);
		type(bookpage.getDropdown3(), expirydateyear);
		type(bookpage.getTxtccv(), cvvnumber);
	   
	}

	@Then("User should click the Booknow button")
	public void user_should_click_the_Booknow_button() throws InterruptedException {
		btnClick(bookpage.getBtnBook());
	    
	    Thread.sleep(5000);
	
	    WebElement orderNo = driver.findElement(By.id("order_no"));
	    Thread.sleep(5000);
	    String OrderValue = orderNo.getAttribute("Value");
	    System.out.println();
	    System.out.println("****************************");
	    System.out.println(" Order No : " + OrderValue);
	    System.out.println("****************************");
	  driver.quit();
	}




}