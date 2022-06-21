package br.ce.braitiner.test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import br.ce.braitiner.core.BaseTeste;
import br.ce.braitiner.pages.CriarMovimetacaoPage;
import br.ce.braitiner.pages.MenuPage;

@RunWith(Parameterized.class)
public class RegrasCadastroTeste extends BaseTeste {
	
	MenuPage menuPage = new MenuPage();
	CriarMovimetacaoPage movPage = new CriarMovimetacaoPage();
	
	
	@Parameter
	public String dataMOvimentacao;
	@Parameter(value=1)
	public String dataPagamento;
	@Parameter(value=2)
	public String descricao;
	@Parameter(value=3)
	public String interessado;
	@Parameter(value=4)
	public String valor;
	@Parameter(value=5)
	public String mensagem;
	
		
	
	
	@Parameters
	public static Collection<Object[]> getCollection(){
		return Arrays.asList(new Object[][]{
			{"", "", "", "", "", "Data da Movimentação é obrigatório"}, 
			{"18/06/2022", "", "", "", "", "Data do pagamento é obrigatório"},
			{"18/06/2022", "18/06/2022", "", "", "", "Descrição é obrigatório"},
			{"18/06/2022", "18/06/2022", "Aluguel", "", "", "Interessado é obrigatório"},
			{"18/06/2022", "18/06/2022", "Aluguel", "Braitiner", "", "Valor é obrigatório"},
			{"18/06/2022", "18/06/2022", "Aluguel", "Braitiner", "1000", "Movimentação adicionada com sucesso!"}
			
		});
	}
	
	@Test
	public void deveValidarRegras() {
		

		menuPage.acessarCriarMovimentacao();
		
		movPage.SetDataMovimentacao(dataMOvimentacao);
		movPage.SetDataPagamento(dataPagamento);
		movPage.SetDescricao(descricao);
		movPage.SetInterassado(interessado);
		movPage.SetValor(valor);
		movPage.salvar();
		
		if (mensagem.contains("Movimentação adicionada com sucesso!")) {
			Assert.assertEquals(mensagem, movPage.obterTextoSucesso());
			
		}else {
			Assert.assertEquals(mensagem, movPage.alertaObterTextoNegado(mensagem));
			
		}
		
	}

}