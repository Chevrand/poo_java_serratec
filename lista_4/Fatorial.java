package br.com.residencia;

import java.util.Scanner;

public class Fatorial {
	
	public static void main(String[] args) {
		
		int numero;
		
		System.out.print("Digite um número inteiro positivo: ");
		Scanner scan = new Scanner(System.in);
		numero = scan.nextInt();
		scan.close();
		System.out.print("\nO fatorial de " + numero + " é: " + fatorial(numero));
	}
	
	public static int fatorial(int numero) {
		
		if(numero ==1 || numero == 0) {
			return 1;
		}
		
		return numero * fatorial(numero -1);
	}
}