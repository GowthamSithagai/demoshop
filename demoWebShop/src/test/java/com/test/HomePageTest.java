package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.SearchPage;
import com.util.TestUtil;

public class HomePageTest  extends TestBase {

	
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	SearchPage searchPage;

	public HomePageTest() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
	
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
	
	
	
	@Test(priority =0)
	public void SearchingLaptopProductTest() {
		
		homePage.SearchForProduct("laptop");
		searchPage = homePage.ClickingSearch();
	}
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown(){ driver.quit(); }
	
	
	

}

