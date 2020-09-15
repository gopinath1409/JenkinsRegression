package com.manager;

import com.base.LibGlobal;
import com.pages.BookPage;
import com.pages.LoginPage;
import com.pages.SearchPage;
import com.pages.SelectPage;

public class PageObjectManager {
private static PageObjectManager pageObjectManager;
private LoginPage loginpage;
private SearchPage searchpage;
private SelectPage selectpage;
private BookPage bookpage;

	public static PageObjectManager getInstance() {
		if(pageObjectManager == null) {
			pageObjectManager = new PageObjectManager();
			
		}
		return pageObjectManager;
	}

	public LoginPage getLoginPage() {
		if (loginpage == null) {
		loginpage = new LoginPage();	
		}
		System.out.println(loginpage);
		
	return loginpage;
		
		
	//	return (loginpage==null) ? loginpage = new LoginPage() : loginpage;
		
	}
		
		
	public SearchPage getSearchPage() {
		return(searchpage == null) ? searchpage= new SearchPage() : searchpage;
		}
	public SelectPage getSelectPage() {
		return(selectpage == null) ? selectpage= new SelectPage() : selectpage;
		}
	public BookPage getBookPage() {
		return(bookpage == null) ? bookpage= new BookPage() : bookpage;
		}
	
	
	
}
