package polimorfismo;


//sobrecarga de métodos
public class Desenho {
	
	//método sem parametro
	public void mostrar() {
		for(int i = 0; i < 10; i++) {
			System.out.println("x");
		}
	}
	
	//método com um parametro
	public void mostrar(char simb) {
		for(int i = 0; i < 10; i++) {
			System.out.println(simb);
		}
	}
	
	//método com dois parametros
	public void mostrar(char simb, int n) {
		for(int i = 0; i < n; i++) {
			System.out.println(simb);
		}
	}
}
