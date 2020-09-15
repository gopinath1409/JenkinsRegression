package org.test;



import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	public WebDriver driver;
	
	@BeforeClass
	private void launch() {	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPINATH-PC\\eclipse-workspace\\TestNG\\driver\\chromedriver.exe");
	driver =new ChromeDriver();
	
	driver.get("http://adactinhotelapp.com/");	
	}
	
//	@AfterClass
//	private void closebrowser() {
	//driver.quit();	
//	}
	
	@BeforeMethod
	private void start() {
		Date date = new Date();
		System.out.println(date);
}
	
@AfterMethod
	private void End() {
		Date date = new Date();
		System.out.println(date);
	}
	
	@Test
	private void loginTestCase()
	{
		
	WebElement txtusername = driver.findElement(By.id("username"));
	
	txtusername.sendKeys("gopigopigopi");
	
	WebElement txtpassword = driver.findElement(By.name("password"));
	
	txtpassword.sendKeys("gopigopigopi");
	
	WebElement btnlogin=driver.findElement(By.id("login"));
	
	btnlogin.click();
//	}

//	@Test
//	private void SearchTestCase()

	{
    Select dropdown = new Select (driver.findElement(By.id("location")));
	dropdown.selectByVisibleText("Sydney");
	
    WebElement btnsubmit =driver.findElement(By.id("Submit"));
	
    btnsubmit.click();
//	}
	
//	@Test
//	private void SelectTestCase()		
//	{
	
    
    WebElement radio =driver.findElement(By.id("radiobutton_1"));
    radio.click();
    
    WebElement btncontinue =driver.findElement(By.id("continue"));
	
    btncontinue.click();
	}
//	}
//	@Test
//	private void BookingTestCase() throws InterruptedException
//	{
	
    WebElement txtFirstname = driver.findElement(By.id("first_name"));
    txtFirstname.sendKeys("Gopi");
	
    WebElement txtLastname = driver.findElement(By.id("last_name"));
    txtLastname.sendKeys("Nath");
	
    WebElement txtaddress = driver.findElement(By.id("address"));
    txtaddress.sendKeys("Ambattur");
	
    WebElement txtCreditcard = driver.findElement(By.id("cc_num"));
    txtCreditcard.sendKeys("1234567891234567");
	
    Select dropdown1 = new Select (driver.findElement(By.id("cc_type")));
	dropdown1.selectByVisibleText("American Express");
	
	Select dropdown2 = new Select (driver.findElement(By.id("cc_exp_month")));
	dropdown2.selectByVisibleText("January");
	
	Select dropdown3 = new Select (driver.findElement(By.id("cc_exp_year")));
	dropdown3.selectByVisibleText("2022");
	
	WebElement txtccv = driver.findElement(By.id("cc_cvv"));
    txtccv.sendKeys("345");
    
    WebElement btnBook =driver.findElement(By.id("book_now"));
	
    btnBook.click();
  //  Thread.sleep(10000);
	}
	}
	
	
		


