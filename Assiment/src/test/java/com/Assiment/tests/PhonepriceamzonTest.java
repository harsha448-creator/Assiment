package com.Assiment.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Assiment.base.TestBase;

import com.Assiment.pages.Homepageamzon;

import com.Assiment.pages.Phonepriceamzon;

public class PhonepriceamzonTest extends TestBase{
	
	Homepageamzon homepageamzon;
	Phonepriceamzon phonepriceamzon;
	
	

	@BeforeMethod
	public void setupForSalePage()
	{
		initilization();
		homepageamzon= new Homepageamzon();
		phonepriceamzon=homepageamzon.searchiphonecolour(prop.getProperty("iphone"));
	}
	@Test
	public void verifyiphonecolour()
	{
		phonepriceamzon.verifyiphonecolour(toString());
	}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
