package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibGlobal {
	public static WebDriver driver;

	public void getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPINATH-PC\\eclipse-workspace\\cucumber6\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize(); 
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
}
