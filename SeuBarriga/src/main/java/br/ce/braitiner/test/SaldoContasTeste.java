package br.ce.braitiner.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.braitiner.core.BaseTeste;
import br.ce.braitiner.pages.HomePage;
import br.ce.braitiner.pages.MenuPage;

public class SaldoContasTeste extends BaseTeste {
	
	MenuPage menuPage = new MenuPage();
	HomePage homePage = new HomePage();
	
	
	@Test
	public void alterarConta() {
		
		menuPage.acessarTelaHome();
		
		
		Assert.assertTrue(homePage.obtersaldo().contains("500.00"));
		
		
		
		
		
	}
	
	
	
	

}
