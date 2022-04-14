package br.com.residencia;

import java.util.Scanner;

public class MiniDp {
	
	public static void main(String[] args) {
		/*O programa �mini departamento pessoal� l� a quantidade de horas trabalhadas por um funcion�rio em um m�s,
		o valor que ele recebe por hora e o percentual de desconto para o INSS, e calcula:
		1. O sal�rio bruto (horas trabalhadas * valor hora)
		2. O valor do desconto para o INSS
		3. O sal�rio l�quido (adicionais menos descontos).
		Ap�s os c�lculos, ser� impresso o contra cheque (Sal�rio bruto, valor do desconto do INSS, e o sal�rio l�quido do funcion�rio).*/
		
		double horas, valorHora, percentualInss, salarioBruto, valorInss, salarioLiquido;
		
		System.out.print("*** Mini Departamento Pessoal ***\n\n");
		System.out.print("Digite a quantidade de horas trabalhadas no �ltimo m�s: ");
		Scanner scan = new Scanner(System.in);
		horas = scan.nextDouble();
		System.out.print("\nDigite o valor que o funcion�rio recebe a cada hora trabalhada: ");
		valorHora = scan.nextDouble();
		System.out.print("\nDigite o percentual de desconto para o INSS: ");
		percentualInss = scan.nextDouble();
		scan.close();
		
		salarioBruto = horas * valorHora;
		valorInss = ((salarioBruto / 100) * percentualInss);
		salarioLiquido = salarioBruto - valorInss;
		
		System.out.println("\n\n\n\n*** Contra Cheque ***\n\n");
		System.out.printf("Sal�rio Bruto: R$ %.2f%n", salarioBruto);
		System.out.printf("\nValor de Desconto do INSS: R$ %.2f%n", valorInss);
		System.out.printf("\nSal�rio L�quido: R$ %.2f%n", salarioLiquido);
	}
}