package br.ce.braitiner.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.braitiner.core.BaseTeste;
import br.ce.braitiner.pages.CriarMovimetacaoPage;
import br.ce.braitiner.pages.MenuPage;

public class InserirMovimentacaoDataFuturaTeste extends BaseTeste {
	
	MenuPage menuPage = new MenuPage();
	CriarMovimetacaoPage movPage = new CriarMovimetacaoPage();
	
	@Test
	public void inserirMovimetacaoDataFutura() {
		
		menuPage.acessarCriarMovimentacao();
		
		movPage.SetTipoDaMovimentacaoReceita();
		movPage.SetDataMovimentacao("18/07/2022");
		movPage.SetDataPagamento("18/06/2022");
		movPage.SetDescricao("Aluguel");
		movPage.SetInterassado("Braitiner");
		movPage.SetValor("1000");
		movPage.SetConta("Conta Movimenta��o");
		movPage.setSituacaoPago();
		movPage.salvar();
		
		Assert.assertEquals("Data da Movimenta��o deve ser menor ou igual � data atual", movPage.alertaObterTextoNegado());
		
		
		
		
		
		
		
	}
	
	
}
