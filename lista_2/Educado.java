package br.com.residencia;

import java.util.Scanner;

public class Educado {

	public static void main(String[] args) {
		/*O programa "Educado" irá perguntar seu nome, e também como você gostaria de ser chamado.
		Depois disso uma saudação para você aparece na tela.*/
		
		String nome, nickname;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("*** Educado ***\n\n");
		System.out.print("Qual o seu nome? ");
		nome = scanner.nextLine();
		System.out.print("\nOlá, " + nome + "! De que forma gostaria de ser chamado(a)? ");
		nickname = scanner.nextLine();
		scanner.close();
		System.out.print("\nSeja bem vindo(a), " + nickname + "!");
	}
}