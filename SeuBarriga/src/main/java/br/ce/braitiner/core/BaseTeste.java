package br.ce.braitiner.core;

import static br.ce.braitiner.core.DriverFactory.getDriver;
import static br.ce.braitiner.core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.ce.braitiner.pages.LoginPage;


public class BaseTeste {
	
		
	@Rule
	public TestName testName = new TestName();
	
private LoginPage page = new LoginPage();
	
	@Before
	public void inicializa() {
		page.acessarTelaInicial();
		page.setEmail("braitiner@braitiner.com");
		page.setSenha("123456");
		page.clicarBotaoEntrar();
	}
	

	
	@After
	public void finalizacao() throws IOException{
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("target" +File.separator+"screenshot"+File.separator+testName.getMethodName()+".jpg"));
		
		if(Propriedades.FECHAR_BROWSER == true) {
			killDriver();
		}
	}
	
	
		
		

}
