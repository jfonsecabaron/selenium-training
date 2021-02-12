package com.planittesting.automation.webAutomation.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrontPage {

	private WebDriver driver;

	public FrontPage(WebDriver driver) {
		this.driver = driver;

	}
	
	public void setSearchText(String text) {
		
		WebElement searchSpace = driver.findElement(By.id("search_query_top"));
		searchSpace.sendKeys(text);
				
	}
	
	public void clickSearchButton () {
		
		WebElement buttonSearch = driver.findElement(By.cssSelector("#searchbox > button"));
		buttonSearch.click();
	}
	
	
}
