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

public class ColpensionesTest {
	private WebDriver driver;
	
	@BeforeEach
	public void testSetUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.colpensiones.gov.co/exterior/");
				
	}
	
	@AfterEach
	public void shutDownTest() {
		driver.quit();
	}
	
	@Test
	public void validateButtonQuieroSer() {
		
		WebElement contacElement = driver.findElement(By.id("megaanchor20079105-1"));
		String colpensiones = contacElement.getText();
		
		assertEquals("Quiero ser parte", colpensiones);
		
	}
	
	@Test
	public void openButtonQuieroSer() {
		
		WebElement contacElement = driver.findElement(By.id("megaanchor20079105-1"));
		contacElement.click();
		
		WebElement titleElement = driver.findElement(By.cssSelector("#infoPrincipal > div.bloqueZona1 > div > div > center > h2"));
		String titString = titleElement.getText();
		
		assertEquals("QUEREMOS ESTAR CERCA DE TI", titString);
				
		
				
	}
	

}
