package com.qa.testcases;


import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.AmazonHomePage;
import com.qa.pages.AmazonProductViewPage;
import com.qa.utils.TestBase;

public class AmazonTestCases extends TestBase {
	
	WebDriver driver;	
	static double amazonPriceofIphone;
	AmazonHomePage amazonHome;
	AmazonProductViewPage amazonProduct;
	
	@BeforeClass
	public void launchBrowser() {
		driver = initializeDriver();
	}
	
	@Test(priority=1)
	public void openAmazonWeb() {
		driver.get(getProperty("Amazon_url"));
		//System.out.println(driver.getTitle());
	}
	
	@Test(priority=2)
	public void searchForIphoneXrYellow() {
		amazonHome = new AmazonHomePage(driver);
		amazonHome.getSearchBoxText().sendKeys(getProperty("searchText"),Keys.ENTER);
	}
	
	@Test(priority=3)
	public void getPriceOfIphoneXrYellow() {
		amazonProduct = new AmazonProductViewPage(driver);
		amazonHome.getIphoneXrResult().click();
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getTitle());
		double AmazonPrice = (Double.parseDouble(amazonProduct.getIphoneXrYellowPrice().getText().substring(2,8).replaceAll("[^0-9]", "")));		
		//System.out.println(AmazonPrice);
		amazonPriceofIphone=AmazonPrice;
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
