package exercicios06_04_2022;

/*
 4. Crie uma classe funcion�rio e apresente os atributos e m�todos 
 referentes esta classe, em seguida crie um objeto funcion�rio, defina as 
 instancias deste objeto e apresente as informa��es deste objeto no 
console. 
 * */

public class Funcionario {
	
	String nome;
	int idade;
	String sexo;
	String cidade;

	void status() {
		System.out.print("\nNome do funcion�rio: "+ this.nome);
		System.out.print("\nIdade: "+ this.idade);
		System.out.print("\nSexo: "+this.sexo);
		System.out.print("\nCidade em que mora: "+this.cidade);
	}
	
	void moraAqui() {
		if(this.cidade=="Salvador") {
			System.out.print("\n\nMora na mesma cidade em que est� a empresa!\n\n");
		}
		else {
			System.out.print("\n\nMora em outra cidade, s� pode trabalhar a distancia.\n\n");
		}
	}
	
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Gabriele";
		f1.idade= 21;
		f1.sexo= "feminino";
		f1.cidade= "S�o Paulo";
		f1.status();
		f1.moraAqui();
		
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Jo�o";
		f2.idade= 25;
		f2.sexo= "masculino";
		f2.cidade= "Salvador";
		f2.status();
		f2.moraAqui();
	}

}
