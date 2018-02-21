package com.chiselon.classifieds.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbrowser extends commons
{

	public WebDriver browsername(String browservalue) throws Exception
	{
		try
		{
		
		if(browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\ColorClassifieds\\driver\\chromedriver.exe");
			driver= new ChromeDriver();
		}else if(browservalue.equalsIgnoreCase("firefox"))
		{
			
		}else if(browservalue.equalsIgnoreCase("IE"))
		{
			
		}else
		{
			System.out.println(browservalue + " : is not valid");
		}
		
		
	return driver;
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	
	
	
}
