package br.com.residencia;

import java.util.Scanner;

public class ProgramaFidelidadeMultiplica {
	
	public static void main(String[] args) {
		/*O “Programa de fidelidade” aumentou o sistema, criando o botão “Multiplique seus pontos”.
		O cliente irá digitar quantos cupons tem, e o sistema irá triplicar o valor.*/
		
		int cupons, pontos;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("*** Multiplique Seus Pontos ***\n\n");
		System.out.println("Seja bem vindo(a) ao nosso sistema de verificação de pontos, onde agora seus cupons valem o triplo!");
		System.out.print("\nPara consultá-los, por gentileza, insira o número de cupons que você possui: ");
		cupons = scanner.nextInt();
		scanner.close();
		
		pontos = cupons * 3;
		
		System.out.println("\nParabéns, seus cupons agora valem " + pontos + " pontos!");
	}
}