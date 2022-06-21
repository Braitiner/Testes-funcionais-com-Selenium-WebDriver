package br.ce.braitiner.core;

public class Propriedades {
	
	public static boolean FECHAR_BROWSER = true;
	
	public static Browsers browsers = Browsers.CHROME;
	
	public static String NOME_CONTA_ALTERADA = "Conta alterada" + System.nanoTime();
	
	public enum Browsers{
		CHROME,
		FIREFOX
	}

}
