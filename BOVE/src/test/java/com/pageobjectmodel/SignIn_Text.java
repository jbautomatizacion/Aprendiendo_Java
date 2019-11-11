package com.pageobjectmodel;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignIn_Text {
	
	private WebDriver driver;
	SigninPage signinPage;

	@Before
	public void setUp() throws Exception {
		signinPage = new SigninPage(driver);
		driver = signinPage.chromeDriverConnection();
		signinPage.visit("http://newtours.demoaut.com/mercurywelcome.php");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		signinPage.signIn();
		Thread.sleep(2000);
		assertTrue(signinPage.isHomePageDisplayed());
	}

}
