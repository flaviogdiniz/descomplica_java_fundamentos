package fundamentos;


class Somar {
	public static int somar(int a, int b) {
		return a + b;
	}
}



public class MetodosJava {

	public static void main(String[] args) {
		
		int total = Somar.somar(10, 5);
		
		System.out.println("Total da soma: " + total);

	}

}
