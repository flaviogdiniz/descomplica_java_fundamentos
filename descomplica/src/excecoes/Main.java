package excecoes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		try {
			System.out.println("Digite um valor: ");
			int numero1 = entrada.nextInt();
			
			System.out.println(numero1);

		} catch (Exception e) {
			System.out.println("ERRO - Valor não é um numero");
		}
	}

}
