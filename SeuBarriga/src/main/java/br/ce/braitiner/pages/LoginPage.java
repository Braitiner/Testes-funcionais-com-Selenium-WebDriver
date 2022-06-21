package br.ce.braitiner.pages;

import org.openqa.selenium.By;

import br.ce.braitiner.core.BasePage;
import br.ce.braitiner.core.DriverFactory;

public class LoginPage extends BasePage {
	
	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("https://seubarriga.wcaquino.me/login");
	}
	
	
	public void setEmail(String texto) {
		escrever(By.id("email"), texto);
	}
	
		
	public void setSenha(String texto) {
		escrever(By.id("senha"), texto);
	}
	
	
	public void clicarBotaoEntrar() {
		clicarBotao(By.xpath("//button[.='Entrar']"));
	}
	
	public void logar(String email, String senha) {
		setEmail(email);
		setSenha(senha);
		clicarBotaoEntrar();
	}
	
	

}
