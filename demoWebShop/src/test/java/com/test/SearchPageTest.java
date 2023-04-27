package com.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.LaptopDetailsPage;
import com.pages.LoginPage;
import com.pages.SearchPage;
import com.util.TestUtil;

public class SearchPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	SearchPage searchPage;
	LaptopDetailsPage LaptopDetailsPage;
	public SearchPageTest() {
		super();
	}

	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
	
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		homePage.SearchForProduct("laptop");
		searchPage = homePage.ClickingSearch();
	}
	
	
	public void VerifyLaptopLinkText() {
		String LaptopText = searchPage.CheckingLaptopTitle();
		Assert.assertEquals(LaptopText, "14.1-inch Laptop");
		 
		
	}
	
	@Test(priority = 0)
	public void clickingLaptopLinkTest() {
		LaptopDetailsPage = searchPage.ClickingLaptopLink();
	}
	

}
