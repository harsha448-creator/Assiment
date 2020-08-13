package com.Assiment.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Assiment.base.TestBase;
import com.Assiment.pages.Homepageamzon;
import com.Assiment.pages.Phonepriceamzon;

public class HomepageamzonTest extends TestBase {

	Homepageamzon homepageamzon;
	Phonepriceamzon phonepriceamzon;

	@BeforeMethod
	public void setupHomePage() {
		initilization();
	}

		
	@Test
	public void verifyiphonecolourTest() {
		homepageamzon = new Homepageamzon();
		phonepriceamzon = homepageamzon.searchiphonecolour(prop.getProperty("iphone"));
		Assert.assertTrue(phonepriceamzon.verifyiphonecolour(prop.getProperty("iphone")));
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
