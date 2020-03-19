package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipkartProductViewPage {
	WebDriver driver;
	
	public FlipkartProductViewPage(WebDriver driver) {
		this.driver= driver;
	}
	
	By flipkartXrYellowPrice = By.xpath("//div[@class='_1vC4OE _3qQ9m1']");
	
	public WebElement getflipkartXrYellowPrice() {
		return driver.findElement(flipkartXrYellowPrice);
	}
}
