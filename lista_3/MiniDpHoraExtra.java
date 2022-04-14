package br.com.residencia;

import java.util.Scanner;

public class MiniDpHoraExtra {
	
	public static void main(String[] args) {
		/*O �mini DP� aumentou seus c�lculos.
		Agora, considera a jornada de trabalho semanal de um funcion�rio, que � de 40 horas.
		O funcion�rio que trabalhar mais de 40 horas receber� hora extra, cujo c�lculo � o valor da hora regular com um acr�scimo de 50%.
		Considerando que o m�s possui 4 semanas exatas, e que a entrada de horas ser� um valor maior que a jornada normal.
		1. Sal�rio base (valor da hora * horas normais)
		2. Valor de horas extras
		3. Valor do desconto para o INSS
		4. Sal�rio l�quido (Sal�rio base + horas extras � desconto INSS)
		Imprimir o contracheque do funcion�rio.*/
		
		float horas, valorHora, percentualInss, salarioBruto, valorInss, valorHorasExtras, salarioLiquido;
		
		System.out.print("*** Mini Departamento Pessoal ***\n\n");
		System.out.println("Digite a quantidade de horas trabalhadas no �ltimo m�s: ");
		Scanner scan = new Scanner(System.in);
		horas = scan.nextFloat();		
		System.out.println("Digite o valor que o funcion�rio recebe a cada hora trabalhada: \"");
		valorHora = scan.nextFloat();
		System.out.println("Digite o percentual de desconto para o INSS: ");
		percentualInss = scan.nextFloat();
		scan.close();
		
		if(horas < 160) {
			salarioBruto = horas * valorHora;
			valorHorasExtras = 0;
		}else {
			valorHorasExtras = (((horas * valorHora) - 160) / 100) * 50;
			salarioBruto = (horas * valorHora) + valorHorasExtras;
		}
		
		valorInss = ((salarioBruto / 100) * percentualInss);
		salarioLiquido = salarioBruto - valorInss;
		
		System.out.print("\n\n*** Contra Cheque ***\n\n");
		System.out.printf("Sal�rio Bruto: R$ %.2f%n", salarioBruto);
		System.out.printf("Valor de Horas Extras: R$ %.2f%n", valorHorasExtras);
		System.out.printf("Valor de Desconto do INSS: R$ %.2f%n", valorInss);
		System.out.printf("Sal�rio L�quido: R$ %.2f", salarioLiquido);
	}
}
