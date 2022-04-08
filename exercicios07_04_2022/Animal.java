package exercicios07_04_2022;

public class Animal {
	
	private String nome;
	private int idade;
	
	
	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", idade=" + idade + "]";
	}


	void emitirSom() {
		System.out.println("Este animal emite som");
	}
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}

}
