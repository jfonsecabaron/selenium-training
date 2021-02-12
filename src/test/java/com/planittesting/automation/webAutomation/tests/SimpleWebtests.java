package com.planittesting.automation.webAutomation.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.planittesting.automation.webAutomation.model.FrontPage;
import com.planittesting.automation.webAutomation.model.SearchResultPage;

public class SimpleWebtests {
	
	private WebDriver driver;
	
	@BeforeEach
	public void testSetUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/");
		
	}
	
	@AfterEach
	public void shutDownTest() {
	  driver.quit();
	}
	
	/**@Test
	public void ValidateContactButtonText() {
		
		
		WebElement contactElement = driver.findElement(By.cssSelector("#contact-link a"));
		String text = contactElement.getText();
		
		
		assertEquals("Contact us", text);
		
	}*/

	@Test
	public void validateSearch() {
		
		WebElement searchSpace = driver.findElement(By.id("search_query_top"));
		searchSpace.sendKeys("T-shirt");
		
		WebElement buttonSearch = driver.findElement(By.cssSelector("#searchbox > button"));
		buttonSearch.click();
		
		WebElement tShirt = driver.findElement(By.cssSelector("#center_column > ul > li > div > div"
				+ ".right-block > h5 > a"));
		String textTshirt = tShirt.getText();
		
		assertEquals("Faded Short Sleeve T-shirts", textTshirt);
		
		
	}

	@Test
	public void validateAddCart() {

		WebElement vSearchSpace = driver.findElement(By.id("search_query_top"));
		vSearchSpace.sendKeys("T-shirt");

		WebElement vButtonSearch = driver.findElement(By.cssSelector("#searchbox > button"));
		vButtonSearch.click();

		WebElement buttonAddCart = driver.findElement(By.id("1"));
		buttonAddCart.click();

		WebElement checkAddCart = driver.findElement(By.id("layer_cart_product_quantity"));
		String textCheckAddCart = checkAddCart.getText();

		assertEquals("Quantity", textCheckAddCart);
	}
	
	@Test
	public void validateSearchButton () {
		
		FrontPage frontPage = new FrontPage(driver);
		frontPage.setSearchText("T-Shirt");
		frontPage.clickSearchButton();
		
		SearchResultPage searchResultPage = new SearchResultPage(driver);
		String title = searchResultPage.getProductTitle();
		
		assertEquals("Faded Short Sleeve T-shirts", title);
		
		
	}
	
	

}
