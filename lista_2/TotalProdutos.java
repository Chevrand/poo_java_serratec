package br.com.residencia;

import java.util.Scanner;

public class TotalProdutos {
	
	public static void main(String[] args) {
		/*Um programa "Total de produtos" irá solicitar que o cliente digite quantos produtos irá comprar.
		Depois, exibe a mensagem: "Parabéns por comprar x produtos!", substituindo x pela quantidade.*/
		
		int qtdProdutos;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("*** Total de Produtos ***\n\n");
		System.out.print("Por gentileza, quantos produtos o Sr(a) deseja comprar? ");
		qtdProdutos = scanner.nextInt();
		scanner.close();
		System.out.print("\nParabéns por comprar " + qtdProdutos + " produto(s)!");		
	}
}