package br.com.residencia;

import java.util.Scanner;

public class MiniDp {
	
	public static void main(String[] args) {
		/*O programa “mini departamento pessoal” lê a quantidade de horas trabalhadas por um funcionário em um mês,
		o valor que ele recebe por hora e o percentual de desconto para o INSS, e calcula:
		1. O salário bruto (horas trabalhadas * valor hora)
		2. O valor do desconto para o INSS
		3. O salário líquido (adicionais menos descontos).
		Após os cálculos, será impresso o contra cheque (Salário bruto, valor do desconto do INSS, e o salário líquido do funcionário).*/
		
		double horas, valorHora, percentualInss, salarioBruto, valorInss, salarioLiquido;
		
		System.out.print("*** Mini Departamento Pessoal ***\n\n");
		System.out.print("Digite a quantidade de horas trabalhadas no último mês: ");
		Scanner scan = new Scanner(System.in);
		horas = scan.nextDouble();
		System.out.print("\nDigite o valor que o funcionário recebe a cada hora trabalhada: ");
		valorHora = scan.nextDouble();
		System.out.print("\nDigite o percentual de desconto para o INSS: ");
		percentualInss = scan.nextDouble();
		scan.close();
		
		salarioBruto = horas * valorHora;
		valorInss = ((salarioBruto / 100) * percentualInss);
		salarioLiquido = salarioBruto - valorInss;
		
		System.out.println("\n\n\n\n*** Contra Cheque ***\n\n");
		System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
		System.out.printf("\nValor de Desconto do INSS: R$ %.2f%n", valorInss);
		System.out.printf("\nSalário Líquido: R$ %.2f%n", salarioLiquido);
	}
}