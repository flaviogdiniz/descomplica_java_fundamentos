package collections;

import java.util.TreeSet;

public class Arvore {

	public static void main(String[] args) {
		
		TreeSet<Integer> numeros = new TreeSet<>();
		
		numeros.add(8);
		numeros.add(6);
		numeros.add(9);
		
		System.out.println("TreeSet " + numeros);
		
		boolean result = numeros.remove(6);
		System.out.println("Removeu? " + result);
		System.out.println("TreeSet " + numeros);
		 
		System.out.println("------------------");
		boolean resulta = numeros.remove(61);
		System.out.println("Removeu? " + resulta);
		System.out.println("TreeSet " + numeros);
		
		System.out.println("------------------");
		boolean resultado = numeros.removeAll(numeros);
		System.out.println("Removeu? " + resultado);
		System.out.println("TreeSet " + numeros);

	}

}
