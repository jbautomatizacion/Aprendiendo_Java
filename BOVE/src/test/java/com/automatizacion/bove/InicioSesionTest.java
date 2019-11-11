package com.automatizacion.bove;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class InicioSesionTest {
	
	private WebDriver driver;
	InicioSesionBove inicioSesionBove;
  
  @BeforeClass
  public void beforeClass() {
	  inicioSesionBove = new InicioSesionBove(driver);
	  driver = inicioSesionBove.chromeDriverConnection();
	  inicioSesionBove.visit(inicioSesionBove.url);
  }

  @Test
  public void IniciarSesion() {
	  inicioSesionBove.IniciarSesion();
	  assertEquals("Mis clientes", inicioSesionBove.InicioSesisionExitoso());
  }
  
  @AfterClass
  public void afterClass() {
	  //driver.quit();
  }

}
