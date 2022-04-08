package br.com.residencia;

import java.text.NumberFormat;

public class BalacoTrimestral {
	
	public static void main(String[] args) {
		/*Declara váriaveis referentes a gastos dos 3 primeiros meses do ano. Em seguida,
		somas as mesmas e exibe o resultado em uma mensagem.*/
		
		float gastosJaneiro = 15000;
		float gastosFevereiro = 23000;
		float gastosMarco = 17000;
		float gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println(NumberFormat.getCurrencyInstance().format(gastosTrimestre));
		
	}

}