package br.com.residencia;

import java.util.Scanner;

public class Educado {

	public static void main(String[] args) {
		/*O programa "Educado" ir� perguntar seu nome, e tamb�m como voc� gostaria de ser chamado.
		Depois disso uma sauda��o para voc� aparece na tela.*/
		
		String nome, nickname;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("*** Educado ***\n\n");
		System.out.print("Qual o seu nome? ");
		nome = scanner.nextLine();
		System.out.print("\nOl�, " + nome + "! De que forma gostaria de ser chamado(a)? ");
		nickname = scanner.nextLine();
		scanner.close();
		System.out.print("\nSeja bem vindo(a), " + nickname + "!");
	}
}