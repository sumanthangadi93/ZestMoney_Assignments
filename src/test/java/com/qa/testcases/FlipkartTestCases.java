package com.qa.testcases;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.qa.pages.FlipkartHomePage;
import com.qa.pages.FlipkartProductViewPage;
import com.qa.utils.TestBase;

public class FlipkartTestCases extends TestBase {
	WebDriver driver;
	static double flipkartPriceOfIphone;
	FlipkartHomePage flipkartHome;
	FlipkartProductViewPage flipkartProduct;
	
	@BeforeClass
	public void launchBrowser() {
		driver = initializeDriver();
	}
	
	@Test(priority=1)
	public void openAmazonWeb() {
		driver.get(getProperty("Flipkart_url"));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	}
	
	@Test(priority=2)
	public void searchForIphoneXrYellow() {
		flipkartHome = new FlipkartHomePage(driver);
		flipkartHome.getflipkartSearchBoxText().sendKeys(getProperty("searchText"),Keys.ENTER);
	}
	
	@Test(priority=3)
	public void getPriceOfIphoneXrYellow() {
		flipkartProduct = new FlipkartProductViewPage(driver);
		flipkartHome.getflipkartIphoneXrResult().click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getTitle());
		double flipkartPrice = (Double.parseDouble(flipkartProduct.getflipkartXrYellowPrice().getText().substring(1).replaceAll("[^0-9]", "")));		
		//System.out.println(flipkartPrice);
		flipkartPriceOfIphone=flipkartPrice;
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
