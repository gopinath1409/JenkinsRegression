package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A {
	
	public WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	private void tc1(String s1) {
		System.out.println("Test 1: " + Thread.currentThread().getId() + s1);
	

	if(s1.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPINATH-PC\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
			
	}else if(s1.equals("ie")) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\GOPINATH-PC\\eclipse-workspace\\Selenium1\\driver\\IEdriverServer.exe");
		driver =new InternetExplorerDriver();
	}else {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GOPINATH-PC\\eclipse-workspace\\Selenium1\\driver\\geckodriver.exe");
		driver =new FirefoxDriver();
	}
	
	driver.get("https://www.facebook.com/");
	
	}
}

