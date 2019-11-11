package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGExample {

	WebDriver driver;
	By searchBoxLocator = By.id("search_query_top");
	By resulsLocator = By.cssSelector("span.heading-counter");
	
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}

	@Test
	public void f() {
		WebElement searchBox = driver.findElement(searchBoxLocator);
		searchBox.clear();
		searchBox.sendKeys("blouse");
		searchBox.submit();
		
		WebDriverWait wait = new WebDriverWait(driver,7);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(resulsLocator));
		
		System.out.println("This is the result number: " + driver.findElement(resulsLocator).getText());
		
		assertTrue(driver.findElement(resulsLocator).isDisplayed(), "The result number is not present");
	}

	
	@AfterClass
	public void afterClass() {
		//driver.quit();
	}

}
