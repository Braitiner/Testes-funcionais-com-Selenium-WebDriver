package br.ce.braitiner.pages;

import org.openqa.selenium.By;

import br.ce.braitiner.core.BasePage;

public class ExtratoPage extends BasePage {
	
	public void setMes(String mes) {
		selecionarCombo("mes", mes);
		
	}

	public void setAno(String ano) {
		selecionarCombo("ano", ano);
		
	}

	public void buscar() {
		clicarBotao(By.xpath("//input[@value='Buscar']"));
	}

	public void removerMovimentacao() {
		clicarBotao(By.xpath("//td[.='Conta Movimentação']//..//span[@class='glyphicon glyphicon-remove-circle']"));
	}
	
	public String obterTextoSucesso() {
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
		
	}
	
public String validarResumoVazio() {
		
		return obterTexto(By.xpath("//table[@id=\"tabelaExtrato\"]//td"));
		
	}
	
		
	
}
