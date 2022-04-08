package br.com.residencia;

import java.util.Scanner;

public class MiniCalculadora {
	
	public static void main(String[] args) {
		/*Crie o programa “mini calculadora”, que após ler dois números reais apresenta as operações de soma,
		subtração, multiplicação e divisão com eles.*/
		
		Scanner scanner = new Scanner(System.in);
		
		double soma, sub, mult, div, numero1, numero2;
		
		System.out.println("Seja bem vindo(a) à Mini Calculadora!\n");
		System.out.print("Insira o primeiro número a ser calculado: ");
		numero1 = scanner.nextInt();
		System.out.print("Insira o segundo número a ser calculado: ");
		numero2 = scanner.nextInt();
		
		soma = numero1 + numero2;
		sub = numero1 - numero2;
		mult = numero1 * numero2;
		
		if(numero2 ==0) {
			System.out.println("Soma: " + soma + "\nSubtração: " + sub + "\nMultiplicação: " + mult + "\nDivisão: Não é possível realizar a divisão de um número por 0.");
		}
		else {
			div = numero1 / numero2;
			System.out.println("Soma: " + soma + "\nSubtração: " + sub + "\nMultiplicação: " + mult + "\nDivisão: " + div);
		}
		scanner.close();
	}
}