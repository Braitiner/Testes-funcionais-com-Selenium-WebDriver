package br.ce.braitiner.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.braitiner.core.BaseTeste;
import br.ce.braitiner.core.Propriedades;
import br.ce.braitiner.pages.MenuPage;
import br.ce.braitiner.pages.ContasPage;

public class InserirContaMesmoNome extends BaseTeste {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contaPage = new ContasPage();
	
	@Test
	public void inserirContaMesmoNome() {
		
		menuPage.acessarTelaInserirConta();
		
		contaPage.SetNome(Propriedades.NOME_CONTA_ALTERADA);
		contaPage.clicarBotaoSalvar();
		
		Assert.assertEquals("Já existe uma conta com esse nome!",contaPage.obterTextoFalha());
		
	}
	
	
}
