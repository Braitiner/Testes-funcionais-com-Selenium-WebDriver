package br.ce.braitiner.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.braitiner.core.BaseTeste;
import br.ce.braitiner.pages.ExtratoPage;
import br.ce.braitiner.pages.MenuPage;

public class RemoverMovimentacaoTeste extends BaseTeste {
	
	MenuPage menuPage = new MenuPage();
	ExtratoPage extratoPage = new ExtratoPage();
	
	@Test
	public void inserirConta() {
		
		menuPage.acessarResumoMensal();
		
		extratoPage.setMes("Junho");
		extratoPage.setAno("2022");
		extratoPage.buscar();
		extratoPage.removerMovimentacao();
		
		Assert.assertEquals("Movimentação removida com sucesso!", extratoPage.obterTextoSucesso());
		
	}
	
	
	
}
