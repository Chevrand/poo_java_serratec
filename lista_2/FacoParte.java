package br.com.residencia;

public class FacoParte {
	
	public static void main(String[] args) {
		/*O sistema �Fa�o parte� vai te mostrar um hist�rico da trajet�ria de nossa cidade.
		O resultado apresentado na tela ser�: �Teres�polis tem X anos. Desses, Y foram antes de mim.
		Mas os �ltimos Z anos contaram comigo!�.
		Cada letra mai�scula do texto ser� uma vari�vel, sendo que �x� e �z� s�o valores fixos, e �y� ir� conter uma express�o.*/
		
		final int idadeTeresopolis = 130, idadeProgramador = 28;
		int diferenca = idadeTeresopolis - idadeProgramador;
		
		System.out.print("*** Fa�o Parte ***\n\n");
		System.out.println("Teres�polis tem " + idadeTeresopolis + " anos. Destes, " + diferenca + " foram antes de mim.\n");
		System.out.println("Mas os �ltimos " + idadeProgramador + " anos contaram comigo!");
	}
}