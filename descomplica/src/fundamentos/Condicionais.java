package fundamentos;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		
		

		int nota ;
		
		System.out.println("Digite a nota: ");
		
		Scanner entrada = new Scanner(System.in);
				
		nota = entrada.nextInt();		

		if (nota >= 7) {
			System.out.println("Aprovado");

		} else if (nota < 7 && nota > 4) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		
		System.out.println("Deseja confirmar? Digite sim ou não.");
		String confirmar;
		
		Scanner novaEntrada = new Scanner(System.in);
		confirmar = novaEntrada.next();
		
		switch (confirmar) {
		case "sim" : 
			System.out.println("Confirmado!");
			break;
			
		case "não" :
			System.out.println("Não confirmado!");
			break;


		default:
			System.out.println("Cancelado");
		}
	}
}
