package org.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	
	public static String readData(int rowNo, int cellNo) throws FileNotFoundException {
		
		File f = new File("C:\\Users\\GOPINATH-PC\\eclipse-workspace\\maven\\testdata\\testdata.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook();
		
		Sheet s = w.getSheet("data");
		
		return null;
	
	
	
		
	}
	
	public static WebDriver driver;
	public static Actions a;
	
	public static WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPINATH-PC\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
		
		
	}
	
	public static void loadUrl(String url) {
		driver.get(url);
		
	}
	
	public static void maxWindow() {
		driver.manage().window().maximize();
		
		
	}

	public static void fill(WebElement e, String s) {
		e.sendKeys(s);
		
	}
	
	public static void btnClick(WebElement e) {
		e.click();
	}
		
		
		// TODO Auto-generated method stub
}




