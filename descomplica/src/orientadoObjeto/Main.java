package orientadoObjeto;

public class Main {

	public static void main(String[] args) {

		Cao cachorro = new Cao();
		cachorro.nome = "Bobby";
		cachorro.Anda();
		
		System.out.println(cachorro.cor);
		
		
		Cao dog = new Cao("Lulu", 12);
		dog.DadosDoCao();
		
		Gato cat = new Gato();
		cat.setNome("Amarelo");
		cat.setIdade(19);
		System.out.println("Nome : " + cat.getNome() + " Idade : " + cat.getIdade());
		
	}

}
