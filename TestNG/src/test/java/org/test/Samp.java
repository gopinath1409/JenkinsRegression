package org.test;

import java.util.Date;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Samp {
	
	public WebDriver driver;
	
	@BeforeClass
	private void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPINATH-PC\\eclipse-workspace\\Junit\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		
	}
	
//	@AfterClass
//	private void CloseBrowser() {
	//	driver.close();
		
//	}

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
	
	@Test(dataProvider = "testdata")
	private void Login(String email, String pass)  {
		String url = driver.getCurrentUrl();
		org.testng.Assert.assertTrue(url.contains("amazon"), "Check the url of application");
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		WebElement txtEmail = driver.findElement(By.id("ap_email"));
		txtEmail.sendKeys(email);
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();
		
		
		WebElement txtpass = driver.findElement(By.id("ap_password"));
		txtpass.sendKeys(pass);
		WebElement btnLogin = driver.findElement(By.id("signInSubmit"));
		btnLogin.click();
		String att = txtEmail.getAttribute("value");
		
		org.testng.Assert.assertEquals(att, "9003121707","check the username");
	}
	
	@DataProvider(name= "testdata")
	public Object[][] data() {
		
		return new Object[][] {
			{"9003121707","Ash.123"},
		//	{"java","robot"},
		//	{"python","spark"}
		};
		
			}		
		
	@Test(dataProvider="searchdata")
	private void Search(String search) {
	
		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearch.sendKeys(search);
		WebElement btnSearch = driver.findElement(By.className("nav-input"));
		btnSearch.click();	
		
	}
	
	@DataProvider(name= "searchdata")
	public Object[][] data1() {
		return new Object[][] {
				
				{"detergent"},
				
		};
		
	}
	@Test
	private void Select() {
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
}


	}
	
	
	
	
				
		

	

	
				
				
				
	
	
	
	
	
	
	
	
	
	

