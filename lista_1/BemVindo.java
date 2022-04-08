package br.com.residencia;

import java.util.Scanner;

public class BemVindo {
	
	public static void main(String[] args) {
		//O programa “bem-vindo” pergunta seu nome e sobrenome, e depois gentilmente te cumprimenta.
		
		Scanner scanner = new Scanner(System.in);
		
		String nome, sobrenome;
		
		System.out.print("Qual o seu nome? ");
		nome = scanner.next();
		System.out.print("E o seu sobrenome? ");
		sobrenome = scanner.next();
		System.out.print("Olá, " + nome + " " + sobrenome + ". Seja bem vindo(a) ao universo da programação!");
		scanner.close();
		
	}

}