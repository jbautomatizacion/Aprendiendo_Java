package com.automatizacion.bove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InicioSesionBove extends BasePOM {
	
	By idUsuarioLocator = By.name("SWEUserName");
	By passwordLocator = By.name("SWEPassword");
	By botonInicioSesionLocator = By.linkText("Inicio de sesión");
	By paginaInicioSesionLocator = By.xpath("//div[text()='Siebel Consumer Goods PE Test']");
	By paginaPrincipalLocator = By.xpath("//a[text()='Mis clientes']");
	String url = "http://f8cloud1158.falabella.cl/econsumersector_esn/start.swe";
	
	public InicioSesionBove(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void IniciarSesion(){
		
		if (isDisplayed(paginaInicioSesionLocator)) {
			type("USUARIO_BOVE3", idUsuarioLocator);
			type("s1bp3u03", passwordLocator);
			click(botonInicioSesionLocator);
		} else {
			System.out.println("No se pudo cargar la página principal");
		}
		
	}
	
	public String InicioSesisionExitoso() {
		
		//espera explicita con 10 segundos haciendo consultas cada 0.5 segundos
		WebDriverWait ewait = new WebDriverWait(driver,30);
		ewait.until(ExpectedConditions.presenceOfElementLocated(paginaPrincipalLocator));
		
		return getText(paginaPrincipalLocator);
		//WebDriverWait ewait = new WebDriverWait(driver, 10);
		//ewait.until(ExpectedConditions.titleContains("quality-stream"));
	}
	
	

}
