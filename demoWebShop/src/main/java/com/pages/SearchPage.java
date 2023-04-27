package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class SearchPage extends TestBase{
	
	
	@FindBy(linkText ="14.1-inch Laptop")
	WebElement laptopLink;
	
	public SearchPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String  CheckingLaptopTitle() {
		return laptopLink.getText();
	}

	public LaptopDetailsPage ClickingLaptopLink(){
		laptopLink.click();
		return new LaptopDetailsPage();
	}
	
}
