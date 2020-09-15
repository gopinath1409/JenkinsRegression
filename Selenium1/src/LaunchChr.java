import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChr {
	
	public WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPINATH-PC\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");	
		
	
	WebElement txtEmail = driver.findElement(By.id("ap_email"));
	txtEmail.sendKeys("9003121707");
	WebElement btnContinue = driver.findElement(By.id("continue"));
	btnContinue.click();
	
	WebElement txtpass = driver.findElement(By.id("ap_password"));
	txtpass.sendKeys("Ash.123");
	WebElement btnLogin = driver.findElement(By.id("signInSubmit"));
	btnLogin.click();
	
	
	WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
	txtsearch.sendKeys("Iphone11");
	
	WebElement btnSearch = driver.findElement(By.className("nav-input"));
	btnSearch.click();	
	
	List<WebElement> li = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	System.out.println(li.size());
	LinkedList<String> pn=new LinkedList<String>();
	
	for(int i=0;i<li.size();i++)
	{
		System.out.println(li.get(i).getText());
	}
	
	
	
	}
	
	
	
}


