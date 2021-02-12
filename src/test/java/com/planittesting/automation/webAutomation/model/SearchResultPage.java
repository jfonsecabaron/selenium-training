package com.planittesting.automation.webAutomation.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage {

	private WebDriver driver;

	public SearchResultPage(WebDriver driver) {
		this.driver = driver;

	}

	public String getProductTitle() {
		WebElement tShirt = driver.findElement(By.cssSelector(".product-container .product-name"));
		String textTshirt = tShirt.getText();
		return textTshirt;

	}

}
