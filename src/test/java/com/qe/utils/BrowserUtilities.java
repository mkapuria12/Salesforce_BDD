package com.qe.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtilities extends TestBase{
	
	
	public void URL()
	{
		driver.get(prop.getProperty("url"));
	}

	
	public void initialization(){
		String browserName = prop.getProperty("browser");
		try {
			if(browserName.equals("chrome"))
			{
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
			
			driver.get("http://google.com");
							
			driver.manage().deleteAllCookies();
					
			}
			else if(browserName.equals("FF"))
			{
				WebDriverManager.firefoxdriver().setup();
				
				driver=new FirefoxDriver();
				
				driver.get("http://google.com");
				
				driver.manage().deleteAllCookies();
				
			}
			}catch(Exception e) {
				System.out.println(e);
			}
	}
	
	public void waitForPageElementToVisible(WebElement eleToWait) 
	    {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			
			wait.until(ExpectedConditions.visibilityOf(eleToWait));
			
		}
	
	public void quitBrowser()
	{
		driver.quit();
	}
	
}
