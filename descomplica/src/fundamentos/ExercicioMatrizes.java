package fundamentos;

public class ExercicioMatrizes {

	public static void main(String[] args) {

		int[][] matriz = { { 9, 8, 7 }, { 5, 3, 2 }, { 6, 6, 7 } };

        int[] maiorLinha = new int[3];
        int[] menorColuna = new int[3];

        // Inicializando menorColuna com valores altos
        for (int i = 0; i < 3; i++) {
            menorColuna[i] = Integer.MAX_VALUE;
        }

        // Encontrando o maior elemento de cada linha e o menor de cada coluna
        for (int i = 0; i < 3; i++) {
            maiorLinha[i] = matriz[i][0]; // Inicializa com o primeiro elemento da linha
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maiorLinha[i]) {
                    maiorLinha[i] = matriz[i][j];
                }
                if (matriz[j][i] < menorColuna[i]) {
                    menorColuna[i] = matriz[j][i];
                }
            }
        }

        // Imprimindo resultados
        for (int i = 0; i < 3; i++) {
            System.out.println("Maior valor na linha " + (i + 1) + " é " + maiorLinha[i]);
            System.out.println("Menor valor na coluna " + (i + 1) + " é " + menorColuna[i]);
        }

        // Verificando se existe ponto de sela
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (maiorLinha[i] == menorColuna[j]) {
                    System.out.println("Ponto de sela é " + maiorLinha[i] + " na linha " + (i + 1) + " e coluna " + (j + 1));
                }
            }
        }
    }
	
}
