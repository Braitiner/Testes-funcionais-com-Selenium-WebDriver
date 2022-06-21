package br.ce.braitiner.pages;

import org.openqa.selenium.By;

import br.ce.braitiner.core.BasePage;

public class HomePage extends BasePage {
	
	public String obtersaldo() {
		
		return obterTexto(By.xpath("//td[.='Conta saldo']//..//td[2]"));
		
	}
		
}
