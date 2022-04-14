package br.com.residencia;

import java.util.Scanner;

public class Laboratorio {
	
	public static void main(String[] args) {
		/*O laborat�rio fabricante de �lcool em gel precisa saber se o produto est� atingindo a concentra��o ideal para desinfec��o,
		que � de 70%. Para a ajudar o laborat�rio, crie um programa onde ser� preenchida a capacidade da garrafa em mililitros,
		e o resultado ser� os volumes de �lcool e de gel que precisam ser misturados para preenchimento do vasilhame.*/
		
		float capacidadeRecipiente, volumeAlcool, volumeGel;
		
		System.out.println("*** C�lculo para Percentual de Alcool Gel 70% ***\n\n");
		System.out.println("Digite a capacidade m�xima do recipiente a ser utilizado em mililitros (ml): ");
		Scanner scan = new Scanner(System.in);
		capacidadeRecipiente = scan.nextFloat();
		scan.close();
		
		volumeAlcool = (capacidadeRecipiente / 100) * 70;
		volumeGel = (capacidadeRecipiente / 100) * 30;
		
		System.out.printf("\nA quantidade de Alcool a ser utilizada � de %.0fml%n", volumeAlcool);
		System.out.printf("\nA quantidade de Gel a ser utilizada � de %.0fml", volumeGel);
	}	
}