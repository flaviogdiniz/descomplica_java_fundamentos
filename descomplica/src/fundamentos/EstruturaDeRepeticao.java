package fundamentos;

import java.util.Scanner;

public class EstruturaDeRepeticao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int num = entrada.nextInt();
		System.out.println("Contando de 0 até o numero digitado : " + num);

		for (int i = 0; i <= num; i++) {
			System.out.println(i);
		}

		System.out.println("///////////////////////");
		int a = 1;
		while (a < 5) {
			System.out.println("imprimindo a: " + a);
			a++;
		}
		System.out.println("///////////////////////");

		int b = 2;
		do {
			System.out.println("imprimindo valor de b: " + b);
			b++;
		} while (b < 5);

		System.out.println("///////Estrutura aninhada////////////////");

		for (int i = 0; i <= 10; i++) {
			for (int x = 0; x <= 10; x++) {
				int mult = i * x;
				System.out.println(i + " x " + x + ":" + mult);
			}
		}
	}

}
