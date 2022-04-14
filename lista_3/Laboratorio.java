package br.com.residencia;

import java.util.Scanner;

public class Laboratorio {
	
	public static void main(String[] args) {
		/*O laboratório fabricante de álcool em gel precisa saber se o produto está atingindo a concentração ideal para desinfecção,
		que é de 70%. Para a ajudar o laboratório, crie um programa onde será preenchida a capacidade da garrafa em mililitros,
		e o resultado será os volumes de álcool e de gel que precisam ser misturados para preenchimento do vasilhame.*/
		
		float capacidadeRecipiente, volumeAlcool, volumeGel;
		
		System.out.println("*** Cálculo para Percentual de Alcool Gel 70% ***\n\n");
		System.out.println("Digite a capacidade máxima do recipiente a ser utilizado em mililitros (ml): ");
		Scanner scan = new Scanner(System.in);
		capacidadeRecipiente = scan.nextFloat();
		scan.close();
		
		volumeAlcool = (capacidadeRecipiente / 100) * 70;
		volumeGel = (capacidadeRecipiente / 100) * 30;
		
		System.out.printf("\nA quantidade de Alcool a ser utilizada é de %.0fml%n", volumeAlcool);
		System.out.printf("\nA quantidade de Gel a ser utilizada é de %.0fml", volumeGel);
	}	
}