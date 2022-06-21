package br.ce.braitiner.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.braitiner.core.BaseTeste;
import br.ce.braitiner.pages.CriarMovimetacaoPage;
import br.ce.braitiner.pages.MenuPage;

public class InserirMovimentacaoTeste extends BaseTeste {
	
	MenuPage menuPage = new MenuPage();
	CriarMovimetacaoPage movPage = new CriarMovimetacaoPage();
	
	@Test
	public void inserirMovimetacao() {
		
		menuPage.acessarCriarMovimentacao();
		
		movPage.SetTipoDaMovimentacaoReceita();
		movPage.SetDataMovimentacao("18/06/2022");
		movPage.SetDataPagamento("18/06/2022");
		movPage.SetDescricao("Aluguel");
		movPage.SetInterassado("Braitiner");
		movPage.SetValor("1000");
		movPage.SetConta("Conta Movimentação");
		movPage.setSituacaoPago();
		movPage.salvar();
		
		Assert.assertEquals("Movimentação adicionada com sucesso!", movPage.obterTextoSucesso());
		
		
		
		
		
		
		
	}
	
	
}
