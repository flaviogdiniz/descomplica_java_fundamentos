package polimorfismo;

public class Main {

	public static void main(String[] args) {
		
		Quadrado q1 = new Quadrado();
		q1.desenhar();
		
		Circulo c1 = new Circulo();
		c1.desenhar();
		
		Desenho d1 = new Desenho();
		d1.mostrar();
		
		System.out.println("/////////////");
		
		d1.mostrar('#', 5);
		
		System.out.println("/////////////");
		d1.mostrar('&');

	}

}
