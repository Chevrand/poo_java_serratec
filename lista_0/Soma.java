package br.com.residencia;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		/*L� dois n�meros inteiros e exibe o
		resultado da soma dos mesmos.*/
		int numero1, numero2, resultado;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero:");
		numero1 = leia.nextInt();
		System.out.println("Digite outro n�mero:");
		numero2 = leia.nextInt();
		resultado = numero1 + numero2;
		System.out.println(numero1 + " + " + numero2 + " = " + resultado);
		leia.close();

	}

}
