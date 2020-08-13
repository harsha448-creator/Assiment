package com.Assiment.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Assiment.base.TestBase;

public class Phonepriceamzon extends TestBase {

	@FindBy(how = How.XPATH, using = "//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Apple iPhone XR (128GB) - Yellow')]")
	List<WebElement> brands;

	@FindBy(how = How.XPATH, using = "//tr[@id='priceblock_ourprice_row']")
	public WebElement Iphoneprice;

	

	public WebElement getIphoneprice() {
		return Iphoneprice;
	}
	
	public void setIphoneprice(WebElement iphoneprice) {
		Iphoneprice = iphoneprice;
	}
	
	public Phonepriceamzon() {

		PageFactory.initElements(driver, this);
	}
	public boolean verifyiphonecolour(String iphone)
	{
		System.out.println(brands.size());
		for(int i=0;i<brands.size();i++){
			System.out.println(brands.get(i).getText());//fetching all the brands
			if(brands.get(i).getText().equals("Apple iPhone XR (128GB) - Yellow"))//matching for Apple iPhone XR (128GB) - Yellow only
			{
				brands.get(i).click();//clicking on Apple iPhone XR (128GB) - Yellow
			}
			return ((WebElement) brands).getText().contains(iphone);

		}
		return false;
		
	}


	public static void Explicitwait(int timeout, WebElement e) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(e));
	}
	

}
