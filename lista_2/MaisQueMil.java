package br.com.residencia;

public class MaisQueMil {
	
	public static void main(String[] args) {
		/*O sistema “Mais que mil” irá apresentar o resultado da soma dos 4 primeiros múltiplos de 4 acima de mil,
		subtraindo dos 4 primeiros números primos a partir de um.*/
		
		int contador, multiplo4 = 1000, somaMultiplo4 = 0;
		
		System.out.print("*** Mais que Mil ***\n\n");
		
		for(contador = 1; contador <= 4; contador ++) {
			multiplo4 = multiplo4 + 4;
			somaMultiplo4 = somaMultiplo4 + multiplo4;
		}
		
		System.out.println("A soma dos 4 primeiros múltiplos de 4 acima de mil é " + somaMultiplo4 + ".");
		System.out.println("Subtraindo desta soma os 4 primeiros números primos a partir de 1 temos:\n");
		System.out.println(somaMultiplo4 + " - 2 - 3 - 5 - 7 = " + (somaMultiplo4 - 2 - 3 - 5 - 7) + ".");
	}
}