package com.Assiment.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Assiment.base.TestBase;
import com.Assiment.pages.Homepage;
import com.Assiment.pages.Phoneprice;


public class PhonepriceTest extends TestBase{
	
	Homepage homepage;
	Phoneprice phoneprice;
	

	@BeforeMethod
	public void setupForSalePage()
	{
		initilization();
		homepage= new Homepage();
		phoneprice=homepage.searchiphonecolour(prop.getProperty("iphone"));
	}
	@Test
	public void verifyiphonecolour()
	{
		phoneprice.verifyiphonecolour(toString());
	}
	@Test
	public void verifyPhonePrice(){
		phoneprice.verifyPhonePrice();
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
