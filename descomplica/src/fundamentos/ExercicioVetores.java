package fundamentos;

public class ExercicioVetores {

	public static void main(String[] args) {

		int[] passarosPorDia = { 2, 5, 0, 7, 4, 1, 3, 0, 2, 5, 0, 1, 3, 1 };

		// Número total de passáros

		int total = 0;

		for (int i = 0; i < 14; i = i + 1) {
			int soma = passarosPorDia[i];
			total = soma + total;
		
		}
		System.out.println("O numero total de passaros nos 14 dias foi  " + total);

		// Número total de passáros na primeira semana
		

		int totalSomaPrimeiraSemana = 0;
		
		for (int j = 0; j < 7; j++) {
			
			int somaPrimeiraSemana = passarosPorDia[j];
			totalSomaPrimeiraSemana = somaPrimeiraSemana + totalSomaPrimeiraSemana;
		}
		System.out.println(" Número total de passáros na primeira semana foi " + totalSomaPrimeiraSemana);
		
		
		// Número total de passáros na primeira semana
		

		int totalSomaSegundaSemana = 0;
		for (int x = 7 ;  x < 14; x ++) {
			
			int somaSegundaSemana = passarosPorDia[x];
			totalSomaSegundaSemana = somaSegundaSemana + totalSomaSegundaSemana;
		}
		System.out.println(" Número total de passáros na segunda semana foi " + totalSomaSegundaSemana);

	}

}