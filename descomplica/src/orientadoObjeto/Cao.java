package orientadoObjeto;

public class Cao {
	String nome;
	String cor;
	int idade;
	double peso;
	
	
	//Método construtor
	public Cao() {
		cor = "Caramelo";
	}
	
	public Cao(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void Anda() {
		System.out.println("Estou andando");
	}
	
	public void DadosDoCao() {
		System.out.println("Nome: " + nome + " idade: " + idade);
	}
}
