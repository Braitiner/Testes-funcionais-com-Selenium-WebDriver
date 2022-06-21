package br.ce.braitiner.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.braitiner.core.BaseTeste;
import br.ce.braitiner.pages.MenuPage;
import br.ce.braitiner.pages.ContasPage;

public class RemoverContaMovimentacaoTeste extends BaseTeste {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contaPage = new ContasPage();
	
	
	@Test
	public void removerContaMovimentacao() {
		
		menuPage.acessarTelaListaContas();
		contaPage.removerConta("Conta Movimentação");
		
		
		Assert.assertEquals("Conta em uso na movimentações", contaPage.obterTextoFalha());
		
		
		
		
		
	}
	
	
	
	

}
