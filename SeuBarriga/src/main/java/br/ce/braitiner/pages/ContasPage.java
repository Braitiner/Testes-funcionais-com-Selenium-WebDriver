package br.ce.braitiner.pages;

import org.openqa.selenium.By;

import br.ce.braitiner.core.BasePage;

public class ContasPage extends BasePage {
	
	
	
	public void SetNome(String texto) {
		super.escrever(By.id("nome"), texto);
	}
	
	
	public void clicarBotaoSalvar() {
		clicarBotao(By.xpath("//button[.='Salvar']"));
	}
	
	
	public String obterTextoSucesso() {
		return obterTexto(By.xpath("//body//div[@class='alert alert-success']"));
	}
	
	public String obterTextoFalha() {
		return obterTexto(By.xpath("//div[@class=\"alert alert-danger\"]"));
	}
	
	public void editarConta(String nomeConta) {
		clicarBotao(By.xpath("//td[.='"+nomeConta+"']/..//span[@class='glyphicon glyphicon-edit']"));
	}
	
	public void limparTexto() {
		clicarBotao(By.xpath("//button[.='Salvar']"));
	}


	public void removerConta(String conta) {
		clicarBotao(By.xpath("//td[.='"+conta+"']//..//span[@class='glyphicon glyphicon-remove-circle']"));
		
	}
	
	
	
	
}
