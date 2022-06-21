package br.ce.braitiner.pages;

import br.ce.braitiner.core.BasePage;

public class MenuPage extends BasePage {
	
	
	public void acessarTelaInserirConta() {
		clicarLink("Contas");
		clicarLink("Adicionar");
	}
	
	public void acessarTelaListaContas() {
		clicarLink("Contas");
		clicarLink("Listar");
		
	}
	
	public void acessarCriarMovimentacao() {
		clicarLink("Criar Movimentação");
		
	}
	
	public void acessarResumoMensal() {
		clicarLink("Resumo Mensal");
		
	}

	public void acessarTelaHome() {
		clicarLink("Home");
		
	}

}
