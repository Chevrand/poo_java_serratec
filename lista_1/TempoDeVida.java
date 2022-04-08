package br.com.residencia;

import java.util.Scanner;

public class TempoDeVida {
	
	public static void main(String[] args) {
		/*O programa �Tempo de vida� ir� imprimir a soma das idades de todos os colegas da sua equipe (6 pessoas).
		Pergunte a cada um a idade e n�o esque�a a sua!
		Depois fa�a a atribui��o direta da express�o em uma vari�vel inteira.*/
		
		Scanner scanner = new Scanner(System.in);
		
		int idade, idadeTotal = 0;
		
		for(int i = 1; i <= 6; i++) {
			if(i != 6) {
				System.out.print("Qual a idade do colega " + i + " ? ");
				idade = scanner.nextInt();
				idadeTotal = idadeTotal + idade;
			}
			else {
				System.out.print("Qual a minha idade? ");
				idade = scanner.nextInt();
				idadeTotal = idadeTotal + idade;	
			}
		}
		
		System.out.println("A soma da idade de todos os colegas do grupo, incluindo a minha, � de " + idadeTotal + " anos.");
		scanner.close();
	}
}