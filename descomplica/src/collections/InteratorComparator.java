package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class InteratorComparator {
	
	public static void main(String[]args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		System.out.println("ArrayList " + numeros);
		
		//Criando uma instancia de Iterator
		Iterator<Integer> it = numeros.iterator();
		
		int numero = it.next();
		System.out.println("Elemento " + numero);
		
		while(it.hasNext()) {
			it.forEachRemaining((value) -> System.out.print(value + ", "));
		}
	}

}
