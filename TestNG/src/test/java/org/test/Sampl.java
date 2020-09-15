package org.test;

import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sampl {
	
public WebDriver driver;
	
	@BeforeClass
	private void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPINATH-PC\\eclipse-workspace\\Junit\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		
	}
	
	@AfterClass
	private void CloseBrowser() {
	driver.close();
		
	}

	@BeforeMethod
	private void start() {
		Date date = new Date();
		System.out.println(date);
	}
	
	@AfterMethod
	private void end() {
		Date date = new Date();
		System.out.println(date);
		
	}
	
	@Test
	private void Login()  {
		
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		String url = driver.getCurrentUrl();
		org.testng.Assert.assertTrue(url.contains("amazon"), "Check the url of application");
		WebElement txtEmail = driver.findElement(By.id("ap_email"));
		txtEmail.sendKeys("9003121707");
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();
		
		WebElement txtpass = driver.findElement(By.id("ap_password"));
		txtpass.sendKeys("Ash.123");
		WebElement btnLogin = driver.findElement(By.id("signInSubmit"));
		btnLogin.click();
		String att = txtEmail.getAttribute("value");
		
		org.testng.Assert.assertEquals(att, "9003121707","check the username");
	}
	
	
		
		
		
	@Test
	private void Search()  {
		SoftAssert s=new SoftAssert();
		String title=driver.getTitle();
		s.assertTrue(title.contains("detergent"), "Check the title of application");
	
		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearch.sendKeys("detergent");
		
		String att=txtSearch.getAttribute("value");
		s.assertEquals(att, "detergent","check the search option");
		
		s.assertAll();
		
	}
	
	@Test
	private void Search1()  {
	
		WebElement btnSearch = driver.findElement(By.className("nav-input"));
		btnSearch.click();	
		
		
	}
	
	
	@Test
	private void Select() {
		String url = driver.getCurrentUrl();
		org.testng.Assert.assertTrue(url.contains("surf"), "Check the url of application");
		WebElement btnSelect = driver.findElement(By.xpath("//span[text()='Surf Excel Easy Wash Detergent Powder, 4 kg']"));
		btnSelect.click();
		String par = driver.getWindowHandle();
		Set<String> All = driver.getWindowHandles();
		System.out.println(par);
		System.out.println(All);
		
for (String x: All) {
	if(!par.equals(x)) {
		driver.switchTo().window(x);
		
	}
	
}
	}
	
 @Test
 private void Add() {
	WebElement btnAdd = driver.findElement(By.id("a-autoid-0-announce"));
	
	btnAdd.click();
	
	String nextPageUrl = driver.getCurrentUrl();
	System.out.println(nextPageUrl);
	Assert.assertTrue(nextPageUrl.contains("Surf"), "verify the Add option");
}
}


	
	
	
	
	
				
		

	



