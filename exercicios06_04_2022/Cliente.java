package exercicios06_04_2022;

/*
 1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe,
  em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto no console.
 */

public class Cliente {

	String nome;
	int idade;
	String sexo;
	boolean provando;
	
	void status() {
		System.out.println("O cliente "+this.nome+" que tem "+this.idade+" anos e é do sexo "+this.sexo+".");
		System.out.println("Está provando alguma roupa? "+this.provando);
	}
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		c1.nome = "Gabi";
		c1.idade = 30;
		c1.sexo = "feminino";
 		c1.provando= true;
		c1.status();
		
	}


}