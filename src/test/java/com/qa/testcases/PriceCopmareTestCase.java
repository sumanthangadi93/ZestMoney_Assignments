package com.qa.testcases;

import org.testng.annotations.Test;

public class PriceCopmareTestCase {
	
	@Test
	public void comparePrices() {	
		
		
		if(AmazonTestCases.amazonPriceofIphone<FlipkartTestCases.flipkartPriceOfIphone) {
			System.out.println("Amazon Price is less compared to Flipkart, Amazon price is : "+AmazonTestCases.amazonPriceofIphone);
		}else {
			System.out.println("Flipkart Price is less compared to Amazon, Flipkart price is : "+FlipkartTestCases.flipkartPriceOfIphone);
		}
	}
}
