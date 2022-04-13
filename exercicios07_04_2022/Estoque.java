package exercicios07_04_2022;

import java.util.ArrayList;
import java.util.List;
/*
Neste caso, não extende "Produto" para a classe estoque, pois estoque não é um produto e nem uma variação de...
 */
public class Estoque {
	
	private List<Produto> produtos;
	
	@Override
	public String toString() {
		return "Estoque produtos " + produtos + "";
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		Produto produto3 = new Produto();
		
		produto1.setNome("Blusa");
		produto1.setQuantidade(3);
		produto1.setCor("Azul");
		
		produto2.setNome("Calça");
		produto2.setQuantidade(2);
		produto2.setCor("Amarelo");
		
		produto3.setNome("Saia");
		produto3.setQuantidade(5);
		produto3.setCor("Vermelho");
				
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		
		Estoque estoque = new Estoque();
		estoque.setProdutos(produtos);
		
		System.out.println(estoque.toString());
				
		produtos.remove(produto2);
		
		System.out.println(estoque.toString());
		produtos.set(0, produto2);
		produtos.add(produto1);
		
		System.out.println(estoque.toString());
		
		/*		
		for (Produto p : estoque.getProdutos()) {
			System.out.println("\nNome:" + p.getNome());
			System.out.println("Quantidade: " + p.getQuantidade());
			System.out.println("cor: " + p.getCor()+"\n");
		}*/
		
	

	}

}
