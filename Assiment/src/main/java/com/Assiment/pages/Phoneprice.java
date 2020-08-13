package com.Assiment.pages;

import java.util.List;

import org.apache.commons.codec.binary.StringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Assiment.base.TestBase;

public class Phoneprice extends TestBase {

	@FindBy(how = How.XPATH, using = "//div[@class='_3wU53n']")
	List<WebElement> brands;

	@FindBy(how = How.XPATH, using = "//div[@class='_1vC4OE _3qQ9m1']")
	WebElement Iphoneprice;
	
	
	public WebElement getIphoneprice() {
		return Iphoneprice;
	}
	public void setIphoneprice(WebElement iphoneprice) {
		Iphoneprice = iphoneprice;
	}
	
	
	public Phoneprice() {
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
	
	public void verifyPhonePrice() {
		Phonepriceamzon ppa =  new Phonepriceamzon();
		String amzonprice = ppa.getIphoneprice().getText();
		
		String flipkartprice = getIphoneprice().getText();
		
		if(StringUtils.equals(amzonprice, flipkartprice)) {
			System.out.println("Prices are equal");
		}else {
			System.out.println("Prices are not equal");
		}
		
	}
	
	
	
}
