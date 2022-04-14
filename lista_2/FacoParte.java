package br.com.residencia;

public class FacoParte {
	
	public static void main(String[] args) {
		/*O sistema “Faço parte” vai te mostrar um histórico da trajetória de nossa cidade.
		O resultado apresentado na tela será: “Teresópolis tem X anos. Desses, Y foram antes de mim.
		Mas os últimos Z anos contaram comigo!”.
		Cada letra maiúscula do texto será uma variável, sendo que “x” e “z” são valores fixos, e “y” irá conter uma expressão.*/
		
		final int IDADE_TERESOPOLIS = 130, IDADE_PROGRAMADOR = 28;
		int diferenca = IDADE_TERESOPOLIS - IDADE_PROGRAMADOR;
		
		System.out.print("*** Faço Parte ***\n\n");
		System.out.println("Teresópolis tem " + IDADE_TERESOPOLIS + " anos. Destes, " + diferenca + " foram antes de mim.\n");
		System.out.println("Mas os últimos " + IDADE_PROGRAMADOR + " anos contaram comigo!");
	}
}