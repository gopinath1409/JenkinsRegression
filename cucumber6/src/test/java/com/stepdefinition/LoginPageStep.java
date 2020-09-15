package com.stepdefinition;

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
	public void user_is_on_the_adactin_page() {
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
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User should Search the Hotels {string} , {string} , {string}")
	public void user_should_Search_the_Hotels(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User should click the Search button")
	public void user_should_click_the_Search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User should Select the Radio button")
	public void user_should_Select_the_Radio_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User should click the Continue button")
	public void user_should_click_the_Continue_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User should enter {string} , {string} , {string} , {string} , {string} , {string} , {string} ,{string}")
	public void user_should_enter(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("User should click the Booknow button")
	public void user_should_click_the_Booknow_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


}
