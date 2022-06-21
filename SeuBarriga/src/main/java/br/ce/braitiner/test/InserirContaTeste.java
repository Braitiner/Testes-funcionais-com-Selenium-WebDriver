package br.ce.braitiner.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.braitiner.core.BaseTeste;
import br.ce.braitiner.pages.MenuPage;
import br.ce.braitiner.pages.ContasPage;

public class InserirContaTeste extends BaseTeste {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contaPage = new ContasPage();
	
	@Test
	public void inserirConta() {
		
		menuPage.acessarTelaInserirConta();
		
		contaPage.SetNome("Conta nova");
		contaPage.clicarBotaoSalvar();
		
		Assert.assertEquals("Conta adicionada com sucesso!", contaPage.obterTextoSucesso());
		
	}
	
	
}
