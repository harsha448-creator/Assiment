package com.Assiment.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Assiment.base.TestBase;

public class Homepageamzon extends TestBase {

	@FindBy(how = How.ID, using = "twotabsearchtextbox")
	WebElement SearchBar;

	@FindBy(how = How.XPATH, using = "//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")
	WebElement BtnSearch;
	
	  
	
	public Homepageamzon() {
		
		PageFactory.initElements(driver, this);

	}

	public Phonepriceamzon searchiphonecolour(String iphone)
	{
		
		SearchBar.sendKeys(iphone);	
		BtnSearch.click();
		
		return new Phonepriceamzon();
	}


}
