package br.com.residencia;

import java.util.Scanner;

public class Betmais {
	
	public static void main(String[] args) {
		/*O sistema “Betmais” organiza as apostas de seus amigos.
		1 - Você irá solicitar, a dez amigos, um número entre 1 e 10.
		2 - Quando você receber todos os números, então irá criar uma variável e atribuir nela os valores, da seguinte forma:
		   - Os amigos "1, 2, 3 e 4" (nomes dos amigos) responderam um número par, então você irá somar os pares.
		   - O mesmo irá acontecer para os ímpares, porém serão subtraídos.
		3 - O programa irá imprimir a soma dos pares e a subtração dos ímpares correspondentes.*/
		
		int valor, contador, totalPar = 0, totalImpar = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("*** Bem vindo ao sistema Betmais ***\n\n");
		System.out.print("Por favor, insira dez valores aleatórios entre 1 e 10 para que o sistema separe\na soma dos números pares e a subtração dos números ímpares.\n");
		
		for(contador = 1; contador <= 10; contador ++) {
			
			do {
				System.out.print("\nInsira o " + contador + "º valor: ");
				valor = scanner.nextInt();
				
				if(valor > 0 && valor < 11) {
					
					if(valor % 2 == 0) {
						totalPar += valor;
					}else totalImpar -= valor;
				}
			}while(valor < 0 || valor > 10);		
		}
		
		scanner.close();
		System.out.println("\nO total da soma de números pares é: " + totalPar);
		System.out.println("O total da subtração dos números ímpares é: " + totalImpar);
	}
}