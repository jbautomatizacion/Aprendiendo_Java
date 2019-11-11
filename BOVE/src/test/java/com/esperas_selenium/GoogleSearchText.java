package com.esperas_selenium;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchText {
	
private WebDriver driver;
By videoLinkLocator = By.cssSelector("a[href='https://www.youtube.com/watch?v=R_hh3jAqn8M']");

@Before
public void setUp() throws Exception{
	System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
}

@Test
public void testGooglePage() {
	WebElement searchBox = driver.findElement(By.name("q"));
	
	searchBox.clear();
	
	searchBox.sendKeys("quality-stream Introducción a la Automatización de Software");
	
	searchBox.submit();
	
	//espera implicita 10 segundos
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//espera explicita con 10 segundos haciendo consultas cada 0.5 segundos
	//WebDriverWait ewait = new WebDriverWait(driver, 10);
	//ewait.until(ExpectedConditions.titleContains("quality-stream"));
	
	//fluentWait se usa para pagina con Ajax con tiempo carga variable
	Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(10))
			.pollingEvery(Duration.ofSeconds(2))
			.ignoring(NoSuchElementException.class);
	
	WebElement video = fwait.until(new Function<WebDriver,WebElement>(){
		public WebElement apply(WebDriver driver) {
			return driver.findElement(videoLinkLocator);
		}
	});

	assertTrue(driver.findElement(videoLinkLocator).isDisplayed());
	//assertEquals("quality-stream Introducción a la Automatización de Pruebas de Software - Google Search", driver.getTitle());
	
}

@After
public void tearDown() {
	//driver.quit();
}

}
