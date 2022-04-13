package exercicios07_04_2022;

/*
 Exercício 3 - Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
 trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
 programa deverá atender as seguintes funcionalidades:
 
 Armazenar dados da List;
 Remover dados da list;
 Atualizar dados da list;
 Apresentar todos os dados da list.
 */
public class Produto {
	
	private String nome;
	private int quantidade;
	private String cor;
	
	@Override
	public String toString() {
		return "\nNome do produto: "+nome+"\nVariedade: "+cor+"\nQuantidade: "+quantidade+"\n";	
	}
 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

 	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
 
	public String getCor() {
		return cor;
	}
 
	public void setCor(String cor) {
		this.cor = cor;
	}




}
