package br.com.residencia;

import java.util.Scanner;

public class TotalProdutos {
	
	public static void main(String[] args) {
		/*Um programa "Total de produtos" ir� solicitar que o cliente digite quantos produtos ir� comprar.
		Depois, exibe a mensagem: "Parab�ns por comprar x produtos!", substituindo x pela quantidade.*/
		
		int qtdProdutos;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("*** Total de Produtos ***\n\n");
		System.out.print("Por gentileza, quantos produtos o Sr(a) deseja comprar? ");
		qtdProdutos = scanner.nextInt();
		scanner.close();
		System.out.print("\nParab�ns por comprar " + qtdProdutos + " produto(s)!");		
	}
}