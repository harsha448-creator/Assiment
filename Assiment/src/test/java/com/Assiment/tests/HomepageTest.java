package com.Assiment.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Assiment.base.TestBase;
import com.Assiment.pages.Homepage;
import com.Assiment.pages.Phoneprice;

public class HomepageTest extends TestBase {

	Homepage homepage;
	Phoneprice phoneprice;

	@BeforeMethod
	public void setupHomePage() {
		initilization();
	}

		
	@Test
	public void verifyiphonecolourTest() {
		homepage = new Homepage();
		phoneprice = homepage.searchiphonecolour(prop.getProperty("iphone"));
		Assert.assertTrue(phoneprice.verifyiphonecolour(prop.getProperty("iphone")));
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
