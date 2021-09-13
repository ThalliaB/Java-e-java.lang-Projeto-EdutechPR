package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.calculadorDeImposto;
import br.com.bytebank.banco.modelo.seguroDeVida;

public class testaTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		seguroDeVida seguro = new seguroDeVida();
		
		calculadorDeImposto calc = new calculadorDeImposto();
		calc.registra(seguro);
		calc.registra(cc);
		
		System.out.println(calc.getTotalImposto());
		
	}
	
}