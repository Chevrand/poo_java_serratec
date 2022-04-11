package br.com.residencia;

import java.util.Scanner;

public class Betmais {
	
	public static void main(String[] args) {
		/*O sistema �Betmais� organiza as apostas de seus amigos.
		1 - Voc� ir� solicitar, a dez amigos, um n�mero entre 1 e 10.
		2 - Quando voc� receber todos os n�meros, ent�o ir� criar uma vari�vel e atribuir nela os valores, da seguinte forma:
		   - Os amigos "1, 2, 3 e 4" (nomes dos amigos) responderam um n�mero par, ent�o voc� ir� somar os pares.
		   - O mesmo ir� acontecer para os �mpares, por�m ser�o subtra�dos.
		3 - O programa ir� imprimir a soma dos pares e a subtra��o dos �mpares correspondentes.*/
		
		int valor, contador, totalPar = 0, totalImpar = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("*** Bem vindo ao sistema Betmais ***\n\n");
		System.out.print("Por favor, insira dez valores aleat�rios entre 1 e 10 para que o sistema separe\na soma dos n�meros pares e a subtra��o dos n�meros �mpares.\n");
		
		for(contador = 1; contador <= 10; contador ++) {
			
			do {
				System.out.print("\nInsira o " + contador + "� valor: ");
				valor = scanner.nextInt();
				
				if(valor > 0 && valor < 11) {
					
					if(valor % 2 == 0) {
						totalPar += valor;
					}else totalImpar -= valor;
				}
			}while(valor < 0 || valor > 10);		
		}
		
		scanner.close();
		System.out.println("\nO total da soma de n�meros pares �: " + totalPar);
		System.out.println("O total da subtra��o dos n�meros �mpares �: " + totalImpar);
	}
}