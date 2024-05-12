package collections;

import java.util.ArrayList;

public class ProjetoArray {

	public static void main(String[] args) {

		ArrayList<String> linguagens = new ArrayList<>();
		
		linguagens.add("Java");
		linguagens.add("Csharp");
		linguagens.add("Pyton");
		linguagens.add("JavaScript");
		
		System.out.println("ArrayList: " + linguagens);
		
		String[] arr = new String[linguagens.size()];
		
		linguagens.toArray(arr);
		
		for(String item:arr) {
			System.out.println(item + ", ");
		}

	}

}
