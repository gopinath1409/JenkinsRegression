package org.sample;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample {
	
	public static WebDriver driver;
//Launch Browser	
	@BeforeClass
	public static void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPINATH-PC\\eclipse-workspace\\Junit\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		}
	
	@AfterClass
	public static void QuitBrowser() {
	driver.quit();
}
//LoginPage	
	@Test
	public void loginTestCase()
	{
		String url = driver.getCurrentUrl();
		Assert.assertTrue("Verify url of the application", url.contains("adactin"));
	
		WebElement txtusername = driver.findElement(By.id("username"));
		
		txtusername.sendKeys("gopigopigopi");
				
		
		WebElement txtpassword = driver.findElement(By.name("password"));
		
		txtpassword.sendKeys("gopigopigopi");
		
		 
		WebElement btnlogin=driver.findElement(By.id("login"));
		
		btnlogin.click(); 
		String att = txtusername.getAttribute("value");
		
		Assert.assertEquals("Verify password", "gopigopigopi", att);
	}
//SearchPage	
	@Test
	public void SearchTestCase()
	
	{
		String url = driver.getCurrentUrl();
		Assert.assertTrue("Verify url of the application", url.contains("Search"));
		
		Select dropdown = new Select (driver.findElement(By.id("location")));
		dropdown.selectByVisibleText("Sydney");
		
        WebElement btnsubmit =driver.findElement(By.id("Submit"));
		
        btnsubmit.click();
        
  
       WebElement radio =driver.findElement(By.id("radiobutton_1"));
       radio.click();
        
        WebElement btncontinue =driver.findElement(By.id("continue"));
		
       btncontinue.click();
       
	}
//SelectPage	
	@Test
	public void SelectTestCase()		
	{
		 String url = driver.getCurrentUrl();
		Assert.assertTrue("Verify url of the application", url.contains("Select"));
		        
		
		WebElement radio =driver.findElement(By.id("radiobutton_1"));
       radio.click();
        
       WebElement btncontinue =driver.findElement(By.id("continue"));
		
       btncontinue.click();
	}
//BookingPage	
	@Test
	public void BookingTestCase() throws InterruptedException
	{
		
		String url = driver.getCurrentUrl();
		Assert.assertTrue("Verify url of the application", url.contains("Book"));
		
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
        
        Thread.sleep(10000);
        
        String att = txtFirstname.getAttribute("Value");
		
		Assert.assertEquals("Verify password", "gopi", att);
		
		String attr = txtLastname.getAttribute("Value");
		
		Assert.assertEquals("Verify password", "Nath", attr);	
        
	}
	}
	


