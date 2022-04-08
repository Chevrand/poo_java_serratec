package br.com.residencia;
import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) {
		/*Faz uma breve saudação,coleta o nome e
		sobrenome do usuário para, após isso, exibir
		o nome completo do mesmo em uma frase.*/
		
		String nome, sobrenome;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		nome = leia.next();
		System.out.println("Digite o seu sobrenome:");
		sobrenome = leia.next();
		System.out.println("Seu nome é " + nome + " " + sobrenome + ".");
		leia.close();
		
	}

}