package fundamentos;

public class Matrizes {

	public static void main(String[] args) {
		
		int[][] dados = new int[4][3];
		
		
		int x =0;
		
		for(int i = 0; i < 4; i++ ) {
			
			
			for(int j = 0; j < 3; j++) {
				
				dados[i][j] = x;
				x = x + 1;
				System.out.print(dados[i][j]);
			}
			System.out.print(" ");
		}
		
		

	}

}
