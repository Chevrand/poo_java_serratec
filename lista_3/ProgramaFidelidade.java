package br.com.residencia;

import java.util.Scanner;

public class ProgramaFidelidade {
	
	public static void main(String[] args) {
		/*O �Programa de fidelidade� solicitou a cria��o do sistema �Ver os seus pontos�, onde o cliente poder� consultar seu saldo de pontos.
		O cliente ir� digitar um n�mero inteiro correspondente aos seus cupons. Cada cupom corresponde a 1 ponto.*/
		
		int cupons, pontos;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("*** Ver os Seus Pontos ***\n\n");
		System.out.println("Seja bem vindo(a) ao nosso sistema de verifica��o de pontos!");
		System.out.print("Para consult�-los, por gentileza, insira o n�mero de cupons que voc� possui: ");
		cupons = scanner.nextInt();
		scanner.close();
		
		pontos = cupons;
		
		System.out.println("\nParab�ns! De acordo com seus cupons, voc� possui um saldo total de " + pontos + " ponto(s).");	
	}
}