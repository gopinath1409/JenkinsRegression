package com.base;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LibGlobal {

public static WebDriver driver;
public static final String AUTOMATE_USERNAME = "gopib1";
public static final String AUTOMATE_ACCESS_KEY = "tVN5nE25G3n5SC6NyLDp";
public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

public static WebDriver getDriverCloud() throws MalformedURLException {
	 DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("os_version", "8");
	    caps.setCapability("resolution", "2048x1536");
	    caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "latest");
	    caps.setCapability("os", "Windows");    
	    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		return driver;
}


public static WebDriver getDriver() {
	if (driver == null) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPINATH-PC\\eclipse-workspace\\Cucumber1\\folder1\\chromedriver.exe");
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

