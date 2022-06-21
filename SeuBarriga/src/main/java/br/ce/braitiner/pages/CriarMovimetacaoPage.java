package br.ce.braitiner.pages;

import org.openqa.selenium.By;

import br.ce.braitiner.core.BasePage;

public class CriarMovimetacaoPage extends BasePage {
	
	
	
	public void SetTipoDaMovimentacaoReceita() {
		selecionarCombo("tipo", "Receita");
	}
	
	public void SetDataMovimentacao(String data) {
		escrever("data_transacao", data);
		
	}

	public void SetDataPagamento(String string) {
		escrever("data_pagamento", string);
		
	}

	public void SetDescricao(String string) {
		escrever("descricao", string);
	}

	public void SetInterassado(String string) {
		escrever("interessado", string);
	}

	public void SetValor(String string) {
		escrever("valor", string);
	}

	public void SetConta(String conta) {
		selecionarCombo("conta", conta);
	}

	public void setSituacaoPago() {
		clicarRadio("status_pago");
		
	}

	public void salvar() {
		clicarBotao(By.xpath("//button[.='Salvar']"));;
	}
	
	public String obterTextoSucesso() {
		return obterTexto(By.xpath("//body//div[@class='alert alert-success']"));
	}
	
	public String alertaObterTextoNegado(String mensagem) {
		return obterTexto(By.xpath("//body//div[@class='alert alert-danger']//li[.='"+mensagem+"']"));
	}
	
	public String alertaObterTextoNegado() {
		return obterTexto(By.xpath("//body//div[@class='alert alert-danger']"));
	}
	
	 
	


	
		
	
	
}
