package br.com.residencia;

import java.util.Scanner;

public class MiniCalculadora {
	
	public static void main(String[] args) {
		/*Crie o programa �mini calculadora�, que ap�s ler dois n�meros reais apresenta as opera��es de soma,
		subtra��o, multiplica��o e divis�o com eles.*/
		
		Scanner scanner = new Scanner(System.in);
		
		double soma, sub, mult, div, numero1, numero2;
		
		System.out.println("Seja bem vindo(a) � Mini Calculadora!\n");
		System.out.print("Insira o primeiro n�mero a ser calculado: ");
		numero1 = scanner.nextInt();
		System.out.print("Insira o segundo n�mero a ser calculado: ");
		numero2 = scanner.nextInt();
		
		soma = numero1 + numero2;
		sub = numero1 - numero2;
		mult = numero1 * numero2;
		
		if(numero2 ==0) {
			System.out.println("Soma: " + soma + "\nSubtra��o: " + sub + "\nMultiplica��o: " + mult + "\nDivis�o: N�o � poss�vel realizar a divis�o de um n�mero por 0.");
		}
		else {
			div = numero1 / numero2;
			System.out.println("Soma: " + soma + "\nSubtra��o: " + sub + "\nMultiplica��o: " + mult + "\nDivis�o: " + div);
		}
		scanner.close();
	}
}