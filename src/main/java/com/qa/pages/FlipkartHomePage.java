package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipkartHomePage {
	WebDriver driver;
	
	public FlipkartHomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	By flipkartSearchBoxText = By.xpath("//input[@placeholder='Search for products, brands and more']");
	By flipkartIphoneXrResult = By.xpath("//div[contains(text(),'Apple iPhone XR (Yellow, 64 GB)')]");
	
	public WebElement getflipkartSearchBoxText() {
		return driver.findElement(flipkartSearchBoxText);
	}
	
	public WebElement getflipkartIphoneXrResult() {
		return driver.findElement(flipkartIphoneXrResult);
	}
}
