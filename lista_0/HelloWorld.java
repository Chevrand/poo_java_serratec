package br.com.residencia;
import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) {
		/*Faz uma breve sauda��o,coleta o nome e
		sobrenome do usu�rio para, ap�s isso, exibir
		o nome completo do mesmo em uma frase.*/
		
		String nome, sobrenome;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		nome = leia.next();
		System.out.println("Digite o seu sobrenome:");
		sobrenome = leia.next();
		System.out.println("Seu nome � " + nome + " " + sobrenome + ".");
		leia.close();
		
	}

}