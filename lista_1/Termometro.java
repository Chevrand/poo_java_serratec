package br.com.residencia;

import java.util.Scanner;

public class Termometro {
	
	public static void main(String[] args) {
		/*O programa “termômetro” lê uma temperatura em graus celsius, e devolve sua equivalência na escala fahrenheit.
		(Use: F = C * 1, 8 + 32)*/
		
		Scanner scanner = new Scanner(System.in);
		
		double celsius, fahrenheit;
		
		System.out.println("*** Bem vindo ao Termômetro! ***\n");
		System.out.print("Qual valor em graus celsius você deseja converter? ");
		celsius = scanner.nextDouble();
		
		fahrenheit = (celsius * 1.8) + 32.1;
		
		System.out.println("\nO equivalente a " + celsius + " ºC é " + fahrenheit + " ºF.");
		scanner.close();
	}
}