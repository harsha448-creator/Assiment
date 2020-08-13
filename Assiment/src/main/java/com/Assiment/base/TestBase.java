package com.Assiment.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.Assiment.util.BrowserSelection;
import com.Assiment.util.WebEventListener;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;
	public static WebDriverEventListener eventListener;
	public static EventFiringWebDriver eventfiringdriver;

	public TestBase() {
		log = Logger.getLogger(this.getClass());
		FileInputStream propfile;
		prop = new Properties();
		try {

			propfile = new FileInputStream(".\\src\\main\\java\\com\\Assiment\\config\\config.properties");
			prop.load(propfile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void initilization() {
		driver = BrowserSelection.selectBrowser(prop.getProperty("browser"));

		eventfiringdriver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		eventfiringdriver.register(eventListener);
		driver = eventfiringdriver;
		
		openNewTab(driver, "url1", 1);
	    openNewTab(driver, "url2", 2);
	    
		//driver.get(prop.getProperty("url"));

	}
	
	
	public static void openNewTab(WebDriver driver, String url, int position) {
	    ((JavascriptExecutor) driver).executeScript("window.open()");

	    ArrayList<String>  tabs = new ArrayList<String>(driver.getWindowHandles());
	    System.out.println("tabs : " + tabs.size() + " >position: " + position + " >\t" + url);
	    driver.switchTo().window(tabs.get(position));

	    driver.get(url);
	}

}
