package br.com.residencia;

public class FacoParte {
	
	public static void main(String[] args) {
		/*O sistema “Faço parte” vai te mostrar um histórico da trajetória de nossa cidade.
		O resultado apresentado na tela será: “Teresópolis tem X anos. Desses, Y foram antes de mim.
		Mas os últimos Z anos contaram comigo!”.
		Cada letra maiúscula do texto será uma variável, sendo que “x” e “z” são valores fixos, e “y” irá conter uma expressão.*/
		
		final int idadeTeresopolis = 130, idadeProgramador = 28;
		int diferenca = idadeTeresopolis - idadeProgramador;
		
		System.out.print("*** Faço Parte ***\n\n");
		System.out.println("Teresópolis tem " + idadeTeresopolis + " anos. Destes, " + diferenca + " foram antes de mim.\n");
		System.out.println("Mas os últimos " + idadeProgramador + " anos contaram comigo!");
	}
}