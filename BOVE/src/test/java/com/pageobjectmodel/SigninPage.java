package com.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage extends Base {
	
	By userLocator = By.name("userName");
	By passLocator = By.name("password");
	By signInBtnLocator = By.name("login");
	
	By homePageLocator = By.xpath("//img[@src='/images/hdr_findflight.gif']");

	public SigninPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void signIn() {
		if (isDisplayed(userLocator)) {
			type("qualityadmin", userLocator);
			type("pass1", passLocator);
		} else {
			System.out.println("username textbox was not present");
		}
	}
	
	public boolean isHomePageDisplayed() {
		return isDisplayed(homePageLocator);
	}

}