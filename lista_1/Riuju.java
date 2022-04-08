package br.com.residencia;

public class Riuju {
	
	public static void main(String[] args) {
		/*O programa “Riuju” escreve na tela o resultado das expressões abaixo:
		a) 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66
		b)2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9*/
		
		int a = 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66;
		int b = 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9;
		
		System.out.println("a = 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66\n" + "a = " + a + "\n\n");
		System.out.println("b = 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9\n" + "b = " + b);
	}
}