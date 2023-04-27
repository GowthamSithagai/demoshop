package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LaptopDetailsPage extends TestBase {
	
	@FindBy(id="addtocart_31_EnteredQuantity")
	WebElement Qty;
	
	@FindBy(id="add-to-cart-button-31")
	WebElement addToCartBtn;
	
	

	@FindBy(xpath  ="//span[text()='Shopping cart']")
	WebElement shoppingCartBtn;
	
	
	@FindBy(xpath="//input[@value='Go to cart']")
	WebElement gotoCartBtn;

	public LaptopDetailsPage(){
		PageFactory.initElements(driver, this);
	}
	public void enterQty(String qty) {
		Qty.clear();
		Qty.sendKeys(qty);
		
		
	}
	
	public void clickAddToCart() {
		addToCartBtn.click();
	}
	
	
	public void mouseHoverToShoppingCart() {
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(shoppingCartBtn).build().perform();
	}

	public ShoppingCartPage clickGotoCartBtn() {
		gotoCartBtn.click();
		return new ShoppingCartPage();
	}
}
