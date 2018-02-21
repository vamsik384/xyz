package com.chiselon.classifieds.businessfunctions;

import org.openqa.selenium.WebDriver;

import com.chiselon.classifieds.utilities.commons;

public class business extends commons
{
	
	public void login(WebDriver driver)
	{
		url(driver,"http://www.google.co.in");
		sendkey(driver, "//input[@id='lst-iba']", "Selenium");
		
		sendkey(driver, "//input[@id='lst-ib']", "Webdriver");
	}

}
