package br.com.residencia;

import java.util.Scanner;

public class ProgramaFidelidadeMultiplica {
	
	public static void main(String[] args) {
		/*O �Programa de fidelidade� aumentou o sistema, criando o bot�o �Multiplique seus pontos�.
		O cliente ir� digitar quantos cupons tem, e o sistema ir� triplicar o valor.*/
		
		int cupons, pontos;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("*** Multiplique Seus Pontos ***\n\n");
		System.out.println("Seja bem vindo(a) ao nosso sistema de verifica��o de pontos, onde agora seus cupons valem o triplo!");
		System.out.print("\nPara consult�-los, por gentileza, insira o n�mero de cupons que voc� possui: ");
		cupons = scanner.nextInt();
		scanner.close();
		
		pontos = cupons * 3;
		
		System.out.println("\nParab�ns, seus cupons agora valem " + pontos + " pontos!");
	}
}