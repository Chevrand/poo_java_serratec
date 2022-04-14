package br.com.residencia;

import java.util.Scanner;

public class ProgramaFidelidade {
	
	public static void main(String[] args) {
		/*O “Programa de fidelidade” solicitou a criação do sistema “Ver os seus pontos”, onde o cliente poderá consultar seu saldo de pontos.
		O cliente irá digitar um número inteiro correspondente aos seus cupons. Cada cupom corresponde a 1 ponto.*/
		
		int cupons, pontos;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("*** Ver os Seus Pontos ***\n\n");
		System.out.println("Seja bem vindo(a) ao nosso sistema de verificação de pontos!");
		System.out.print("Para consultá-los, por gentileza, insira o número de cupons que você possui: ");
		cupons = scanner.nextInt();
		scanner.close();
		
		pontos = cupons;
		
		System.out.println("\nParabéns! De acordo com seus cupons, você possui um saldo total de " + pontos + " ponto(s).");	
	}
}