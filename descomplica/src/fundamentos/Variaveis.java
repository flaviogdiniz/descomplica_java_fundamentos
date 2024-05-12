package fundamentos;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {

		String nome = "Flávio";
		int idade = 39;
		float altura = 1.77f;
		boolean empregado = true;
		
		System.out.println("Nome: " + nome + " idade: " + idade + " altura: " + altura + " empregado: " + empregado);
		
		System.out.println("Informe seu sobre nome");
		Scanner entrada = new Scanner(System.in);
		String sobreNome = entrada.next();
		
		System.out.println("Seu sobre nome é : " + sobreNome);

	}

}
