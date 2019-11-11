package com.bove;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InicioSesion {
	
	private WebDriver driver;
	
	@Before
	public void setUP() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://f8cloud1158.falabella.cl/econsumersector_esn/start.swe");
	}
	
	@Test
	public void testInicioSesionBove() {
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement idusuario= driver.findElement(By.name("SWEUserName"));
		WebElement contraseña = driver.findElement(By.name("SWEPassword"));
		WebElement iniciosesion = driver.findElement(By.id("s_swepi_22"));
		
		idusuario.clear();
		idusuario.sendKeys("USUARIO_BOVE3");
		
		contraseña.clear();
		contraseña.sendKeys("s1bp3u03");
		
		iniciosesion.click();
		
		
		//tiempo espero wait implicito
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}
	
	@After
	public void tearDown() {
		//driver.quit();
	}

}
