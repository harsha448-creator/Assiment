package com.Assiment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Assiment.base.TestBase;


public class Homepage extends TestBase {

	@FindBy(how = How.XPATH, using = "//button[@class='_2AkmmA _29YdH8'])")
	WebElement closingpopup;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search for products, brands and more']")
	WebElement SearchBar;
	
	@FindBy(how = How.XPATH, using = "//button[@class='vh79eN']//*[local-name()='svg']")
	WebElement BtnSearch;
    
	
	public Homepage() {
		
		PageFactory.initElements(driver, this);

	}

	public Phoneprice searchiphonecolour(String iphone)
	{
		closingpopup.click();
		SearchBar.sendKeys(iphone);	
		BtnSearch.click();
		
		return new Phoneprice();
	}

	

}
