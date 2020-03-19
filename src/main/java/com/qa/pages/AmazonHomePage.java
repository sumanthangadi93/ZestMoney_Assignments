package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage {
	
	WebDriver driver;
	
	public AmazonHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchBoxText = By.xpath("//input[@id='twotabsearchtextbox']");
	By iphoneXrResult = By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Apple iPhone XR (64GB) - Yellow')]");
	
	
	
	public WebElement getSearchBoxText() {
		return driver.findElement(searchBoxText);
	}
	
	public WebElement getIphoneXrResult() {
		return driver.findElement(iphoneXrResult);
	}	
	
}
