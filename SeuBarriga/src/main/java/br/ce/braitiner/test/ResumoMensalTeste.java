package br.ce.braitiner.test;

import static br.ce.braitiner.core.DriverFactory.getDriver;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import br.ce.braitiner.core.BaseTeste;
import br.ce.braitiner.pages.ExtratoPage;
import br.ce.braitiner.pages.LoginPage;
import br.ce.braitiner.pages.MenuPage;

public class ResumoMensalTeste extends BaseTeste {
	
  LoginPage page = new LoginPage();
	
	@Before
	public void inicializa() {
		page.acessarTelaInicial();
		page.setEmail("testebraitiner@testebraitiner");
		page.setSenha("123456");
		page.clicarBotaoEntrar();
	}
	
	MenuPage menuPage = new MenuPage();
	ExtratoPage extrato = new ExtratoPage();
	
	
	@Test
	public void resumoMensalTesteTryCatch() {
		
		menuPage.acessarResumoMensal();
		
		try {
			getDriver().findElement(By.xpath("//table[@id='tabelaExtrato']/tbody/tr"));
			Assert.fail();
			
		}catch(NoSuchElementException e){
			
			
		}
				
	}
	
	@Test
	public void resumoMensalTesteElementosEncontrados() {
		List<WebElement> elementosEncontrados = 
				getDriver().findElements(By.xpath("//table[@id='tabelaExtrato']/tbody/tr"));
		
		Assert.assertEquals(0, elementosEncontrados.size());
	}
	
	

}
