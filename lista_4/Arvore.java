package br.com.residencia;

import java.util.Scanner;

public class Arvore {
	
	static int altura, numeroEspacos, contador, espacosBase, numeroAsteriscos = 1, alturaBase = 3;
	
	public static void main(String[] args) {
		/*Desenha uma árvore de asteriscos após definir a altura da copa
		em número de asteriscos*/
				
		System.out.print("Digite quantas linhas de altura terá a copa da árvore: ");
		Scanner scan = new Scanner(System.in);
		altura = scan.nextInt();
		scan.close();
		
		numeroEspacos = altura;
		espacosBase = altura -1;
		
		do {
			preencherEspacos();
			preencherAsteriscos();
			numeroEspacos -= 1;
			numeroAsteriscos += 2;
			altura -= 1;
		}while(altura > 0);
		
		do {
			numeroEspacos = espacosBase;
			preencherEspacos();
			preencherBase(contador);
			alturaBase -= 1;
		}while(alturaBase > 0);
	}
	
	public static void preencherEspacos() {
		
		for(contador = 0; contador < numeroEspacos; contador += 1) {
			System.out.print(" ");
		}
	}
	
	public static void preencherAsteriscos() {
		
		for(contador = 1; contador <= numeroAsteriscos; contador += 1) {
			System.out.print("*");
		}
		
		System.out.print("\n");
	}
	
	public static void preencherBase(int contador) {
		
		for(contador =1; contador <= 3; contador += 1) {
			System.out.print("*");			
		}
		
		System.out.print("\n");
	}
}