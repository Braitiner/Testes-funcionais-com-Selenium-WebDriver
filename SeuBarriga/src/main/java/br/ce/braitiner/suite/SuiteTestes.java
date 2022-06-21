package br.ce.braitiner.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ce.braitiner.test.AlterarContaTeste;
import br.ce.braitiner.test.InserirContaMesmoNome;
import br.ce.braitiner.test.InserirContaTeste;
import br.ce.braitiner.test.InserirMovimentacaoDataFuturaTeste;
import br.ce.braitiner.test.InserirMovimentacaoTeste;
import br.ce.braitiner.test.RegrasCadastroTeste;
import br.ce.braitiner.test.RemoverContaMovimentacaoTeste;
import br.ce.braitiner.test.RemoverMovimentacaoTeste;
import br.ce.braitiner.test.ResumoMensalTeste;
import br.ce.braitiner.test.SaldoContasTeste;


@RunWith(Suite.class)
@SuiteClasses({
	InserirContaTeste.class,
	AlterarContaTeste.class,
	InserirContaMesmoNome.class,
	InserirMovimentacaoTeste.class,
	RegrasCadastroTeste.class,
	InserirMovimentacaoDataFuturaTeste.class,
	RemoverMovimentacaoTeste.class,
	RemoverContaMovimentacaoTeste.class,
	SaldoContasTeste.class,
	ResumoMensalTeste.class

})
public class SuiteTestes {
	
	
	

}