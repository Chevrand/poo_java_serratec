package br.com.residencia;

public class FacoParte {
	
	public static void main(String[] args) {
		/*O sistema �Fa�o parte� vai te mostrar um hist�rico da trajet�ria de nossa cidade.
		O resultado apresentado na tela ser�: �Teres�polis tem X anos. Desses, Y foram antes de mim.
		Mas os �ltimos Z anos contaram comigo!�.
		Cada letra mai�scula do texto ser� uma vari�vel, sendo que �x� e �z� s�o valores fixos, e �y� ir� conter uma express�o.*/
		
		final int IDADE_TERESOPOLIS = 130, IDADE_PROGRAMADOR = 28;
		int diferenca = IDADE_TERESOPOLIS - IDADE_PROGRAMADOR;
		
		System.out.print("*** Fa�o Parte ***\n\n");
		System.out.println("Teres�polis tem " + IDADE_TERESOPOLIS + " anos. Destes, " + diferenca + " foram antes de mim.\n");
		System.out.println("Mas os �ltimos " + IDADE_PROGRAMADOR + " anos contaram comigo!");
	}
}