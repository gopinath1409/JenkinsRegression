package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class sample {
	
public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPINATH-PC\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");	
		
		WebElement txtusername = driver.findElement(By.id("username"));
		
		txtusername.sendKeys("gopigopigopi");
		
		WebElement txtpassword = driver.findElement(By.name("password"));
		
		txtpassword.sendKeys("gopigopigopi");
		
		WebElement btnlogin=driver.findElement(By.id("login"));
		
		btnlogin.click();
		
	//	Actions acc = new Actions (driver);
		
		
	    Select dropdown = new Select (driver.findElement(By.id("location")));
		dropdown.selectByVisibleText("Sydney");
		
        WebElement btnsubmit =driver.findElement(By.id("Submit"));
		
        btnsubmit.click();
        
        WebElement radio =driver.findElement(By.id("radiobutton_1"));
        radio.click();
        
        WebElement btncontinue =driver.findElement(By.id("continue"));
		
        btncontinue.click();
		
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
        
       
		
		
		File f = new File("C:\\Users\\GOPINATH-PC\\eclipse-workspace\\maven\\testdata\\testdata.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("data");
		
		for ( int i=0; i< s.getPhysicalNumberOfRows(); i++) {
		
		Row r = s.getRow(i);	
		
		for (int j=0; j<r.getPhysicalNumberOfCells(); j++) {
			Cell c =r.getCell(j);
			System.out.println(c);
		}
		}
}
}

		
	//	Cell c = r.createCell(3);
		
	//	c.setCellValue("java");
   //      FileOutputStream fout = new FileOutputStream(f);
   //      w.write(fout);
	///	
	//	System.out.println("Done Successfully");
	//	
		
	
		
		
		
		



