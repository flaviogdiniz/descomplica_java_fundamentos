package fundamentos;

import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {

	public static void main(String[] args) {

		Random gerador = new Random();
		int x = gerador.nextInt(3);
		
		System.out.println("Adivinhe o numero que estou pensando de 0 até 3");
		
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		
		if(num == x ) {
			System.out.println("Você acertou!");
		}else {
			System.out.println("Você errou!");
			
		}
		
		
		

	}

}
