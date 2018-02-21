package com.chiselon.classifieds.Regression;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.chiselon.classifieds.businessfunctions.business;
import com.chiselon.classifieds.utilities.commons;
import com.chiselon.classifieds.utilities.openbrowser;

public class TC2 extends commons
{
	public openbrowser browser = new openbrowser();
	public business b = new business();
	
	@Parameters("browserkey")
	@BeforeMethod
	public void bm(String browserkey)
	{
	 try {
		driver= browser.browsername(browserkey);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	
	@Test
	public void TC006() throws Exception
	{
		try
		{
			
	     b.login(driver);
			
		}catch(Exception e)
		{
			System.out.println("TC001 is failed : " + e.getMessage());
		}
	}

	
	@AfterMethod
	public void bma()
	{
		//driver.close();
	}
	
}
