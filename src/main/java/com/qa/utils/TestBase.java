package com.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public WebDriver initializeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumanth Angadi\\eclipse-workspace-oxygen\\Assignment_1\\src\\main\\java\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	public String getProperty(String attribute) {
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Sumanth Angadi\\eclipse-workspace-oxygen\\Assignment_1\\src\\main\\java\\com\\qa\\data\\data.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(attribute);
	}
}
