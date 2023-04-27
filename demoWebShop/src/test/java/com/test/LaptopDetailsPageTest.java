package com.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.LaptopDetailsPage;
import com.pages.LoginPage;
import com.pages.SearchPage;
import com.pages.ShoppingCartPage;
import com.util.TestUtil;

public class LaptopDetailsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	SearchPage searchPage;
	LaptopDetailsPage LaptopDetailsPage;
	
ShoppingCartPage shoppingCartPage;
	public LaptopDetailsPageTest() {
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
		LaptopDetailsPage  = searchPage.ClickingLaptopLink();
		
	}
	
	@Test(priority =0)
	public void addingCartLaptoptoCartTest() {
		LaptopDetailsPage.enterQty("2");
		LaptopDetailsPage.clickAddToCart();
		LaptopDetailsPage.mouseHoverToShoppingCart();
		shoppingCartPage=LaptopDetailsPage.clickGotoCartBtn();
	}
	
	
	

}



