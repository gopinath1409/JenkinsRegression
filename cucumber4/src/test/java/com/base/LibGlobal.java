package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibGlobal {
	public static WebDriver driver;

public static WebDriver getDriver(){
  if (driver == null) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPINATH-PC\\eclipse-workspace\\cucumber4\\driver1\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	driver.manage().window().maximize(); 
	
	
}
return driver;
}

public void loadUrl(String url) {
	driver.get(url);
	
}

public void type(WebElement element, String data) {
	element.sendKeys(data);
}

public void btnClick(WebElement element) {
	element.click();
	
}

public void quitBrowser() {
	driver.quit();

}

}

