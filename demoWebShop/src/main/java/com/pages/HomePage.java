package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class HomePage extends TestBase {

	
	@FindBy(id="small-searchterms")
	WebElement SearchBox;
	
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement SearchBtn;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}

	
	public void SearchForProduct(String productLaptop) {
		
		SearchBox.sendKeys(productLaptop);
		
	}
	
	
	public SearchPage ClickingSearch() {
		SearchBtn.click();
		
		return new SearchPage();
	}
	
}
