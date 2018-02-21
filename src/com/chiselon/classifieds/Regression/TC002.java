package com.chiselon.classifieds.Regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.chiselon.classifieds.utilities.commons;

public class TC002 extends commons
{
	
	@BeforeMethod
	public void bm()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\ColorClassifieds\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	
	@Test
	public void TC002() throws Exception
	{
		try
		{
			
			
			driver.get("http://www.google.co.in");
			
			
		}catch(Exception e)
		{
			System.out.println("TC001 is failed : " + e.getMessage());
		}
	}

	
	@AfterMethod
	public void bma()
	{
		driver.close();
	}
}
