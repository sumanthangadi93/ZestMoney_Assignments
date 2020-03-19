package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonProductViewPage {
	
WebDriver driver;
	
	public AmazonProductViewPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By iphoneXrYellowPrice = By.xpath("//span[@id='priceblock_ourprice']");
	
	public WebElement getIphoneXrYellowPrice() {
		return driver.findElement(iphoneXrYellowPrice);
	}
}
