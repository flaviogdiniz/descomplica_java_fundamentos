package fundamentos;

import java.util.ArrayList;

public class Listas {

	public static void main(String[] args) {
		
		ArrayList<String> estados = new ArrayList<>();
		
		estados.add("Espirito Santos");
		estados.add("Ceará");
		estados.add("Rio de Janeiro");
		estados.add("Pernambuco");
		
		estados.remove("Ceará");
	}

}
