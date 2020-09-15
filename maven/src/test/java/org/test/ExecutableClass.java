package org.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.pojo.bookpojo;
import org.pojo.loginpojo;
import org.pojo.searchpojo;
import org.pojo.selectpojo;




public class ExecutableClass extends BaseClass{
	
	public static void main(String[] args) throws IOException
	{
	WebDriver d = launchBrowser();
	
	loadUrl("http://adactinhotelapp.com/");
	
	maxWindow();
	
	//WebElement txtusername = d.findElement(By.id("username"));
	loginpojo l = new loginpojo();
	
	fill(l.gettxtusername(), "gopigopigopi");
	fill(l.txtpassword(), "gopigopigopi");
	btnClick(l.getbtnlogin());
	
	searchpojo l1 = new searchpojo();
	fill(l1.getDropdown(),"Sydney");
	btnClick(l1.getBtnsubmit());
	
	selectpojo l2 = new selectpojo();
	btnClick(l2.getRadio());
	btnClick(l2.getBtncontinue());
	
	bookpojo l3 = new bookpojo();
	fill(l3.getTxtFirstname(),"Gopi");
	fill(l3.getTxtLastname(),"Gopii");
	fill(l3.getTxtaddress(),"Ambattur");
	fill(l3.getTxtCreditcard(),"1234567891234567");
	fill(l3.getDropdown1(),"American Express");
	fill(l3.getDropdown2(),"January");
	fill(l3.getDropdown3(),"2022");
	fill(l3.getTxtccv(),"345");
	btnClick(l3.getBtnBook());
	
	
	
	
	
	
	
	
	//fill(txtusername, readData(1,0));
	
	//WebElement txtpassword = d.findElement(By.name("password"));
	
	
	//fill(txtpassword, readData(1,1));
	
	//WebElement btnlogin=driver.findElement(By.id("login"));
	
	//btnlogin.click();
		
	
	
	}

	
}

