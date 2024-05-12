package fundamentos;

import java.util.ArrayList;

public class ListaBandas {

	public static void main(String[] args) {
		ArrayList<String> bandas = new ArrayList<String>();
		
		//Adiciona um elemento ao final da lista.
		bandas.add("Kiss");
		bandas.add("Beatles");
		bandas.add("Iron Maiden");
		bandas.add("Capital Inicial");
		
		System.out.println(bandas);
		
		//Substituindo um elemento
		bandas.add(bandas.indexOf("Kiss"), "Capital Inicial");
		System.out.println(bandas);
		
		//Removendo um elemento
		bandas.remove("Beatles");
		System.out.println(bandas);
		
		
		//Adiciona um elemento em uma posição específica da lista.
		bandas.add(4, "Nirvana");
		System.out.println(bandas);
		bandas.add(3, "Beatles");
		System.out.println(bandas);
		
		// Retorna o elemento na posição especificada.
		String elemento = bandas.get(2);
		System.out.println(elemento);
		
		//Substitui o elemento na posição especificada pelo elemento fornecido.
		bandas.set(0, "Kiss");
		System.out.println(bandas);
		
		//Retorna o número de elementos na lista.
		int tamanho = bandas.size();
		System.out.println(tamanho);
	}

}
