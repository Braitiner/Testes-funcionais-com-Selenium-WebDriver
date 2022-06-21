package br.ce.braitiner.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.braitiner.core.BaseTeste;
import br.ce.braitiner.core.Propriedades;
import br.ce.braitiner.pages.MenuPage;
import br.ce.braitiner.pages.ContasPage;

public class AlterarContaTeste extends BaseTeste {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contaPage = new ContasPage();
	
	
	@Test
	public void alterarConta() {
		
		menuPage.acessarTelaListaContas();
		
		contaPage.editarConta("Conta nova");
		contaPage.SetNome(Propriedades.NOME_CONTA_ALTERADA);
		contaPage.clicarBotaoSalvar();
		
		Assert.assertEquals("Conta alterada com sucesso!", contaPage.obterTextoSucesso());
		
		
		
		
		
	}
	
	
	
	

}
