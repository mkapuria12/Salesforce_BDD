package com.qe.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static BrowserUtilities bUti=new BrowserUtilities();
	public static Properties prop;

	public TestBase(){

		try {
			//creates property file
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/test/resources/InputFiles/Data.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
