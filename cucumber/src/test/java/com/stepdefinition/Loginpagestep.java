package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginpagestep {
	WebDriver driver;
	
	@Given("User is on the adactin page")
	public void user_is_on_the_adactin_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPINATH-PC\\eclipse-workspace\\cucumber\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();		
	    }

	@When("User should enter username and password")
	public void user_should_enter_username_and_password() {
		
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("java");
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("java");
	    
	}

	@Then("User should click the login button")
	public void user_should_click_the_login_button() {
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	    
	}

	

}
