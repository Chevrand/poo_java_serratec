package br.com.residencia;

import java.util.Scanner;

public class SelfService {
	
	public static void main(String[] args) {
		/*O restaurante "Self-Service" precisa de um programa para imprimir as etiquetas de "comanda" na pesagem dos pratos.
		O operador da balan�a ir� digitar o pre�o do quilo e o total em gramas da refei��o, considerando que o prato vazio pesa 465 gramas (tara).
		A etiqueta ir� conter o nome do restaurante, o tara do prato, o pre�o de 100 gramas, o peso consumido e o valor total.*/
		
		double precoKilo, gramasRefeicao, tara = 0.465, valorPraticado, pesoConsumido, valorTotal;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("*** Restaurante Self-Service ***\n");
		System.out.print("     Impress�o de Comandas\n\n");
		System.out.print("Operador, por gentileza, digite o pre�o por Kg: R$ ");
		precoKilo = scanner.nextDouble();
		System.out.print("\nAgora, digite o peso total em kilogramas (g) da refei��o conforme exibido na balan�a: ");
		gramasRefeicao = scanner.nextDouble();
		
		if(gramasRefeicao < tara) {
		
			do {
				System.out.println("\nPeso em gramas da refei��o menor que a tara do prato!");
				System.out.print("\nPor gentileza, insira um peso v�lido: ");
				gramasRefeicao = scanner.nextDouble();
			}while(gramasRefeicao < tara);
		}else scanner.close();
		
		pesoConsumido = gramasRefeicao - tara;
		valorPraticado = precoKilo / 10;
		valorTotal = pesoConsumido * (valorPraticado * 10);
		
		System.out.println("\n\n\n\n*** Restaurante Self-Service ***\n\n");
		System.out.printf("Valor Praticado (100g): R$ %.2f%n", valorPraticado);
		System.out.printf("Tara do Prato: %.3fKg%n", tara);
		System.out.printf("Peso Consumido: %.3fKg%n", pesoConsumido);
		System.out.printf("Valor Total: R$ %.2f%n%n",valorTotal);
		System.out.print("Muito obrigado e volte sempre!");
	}
}