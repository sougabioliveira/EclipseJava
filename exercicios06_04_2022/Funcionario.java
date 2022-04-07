package exercicios06_04_2022;

/*
 4. Crie uma classe funcionário e apresente os atributos e métodos 
 referentes esta classe, em seguida crie um objeto funcionário, defina as 
 instancias deste objeto e apresente as informações deste objeto no 
console. 
 * */

public class Funcionario {
	
	String nome;
	int idade;
	String sexo;
	String cidade;

	void status() {
		System.out.print("\nNome do funcionário: "+ this.nome);
		System.out.print("\nIdade: "+ this.idade);
		System.out.print("\nSexo: "+this.sexo);
		System.out.print("\nCidade em que mora: "+this.cidade);
	}
	
	void moraAqui() {
		if(this.cidade=="Salvador") {
			System.out.print("\n\nMora na mesma cidade em que está a empresa!\n\n");
		}
		else {
			System.out.print("\n\nMora em outra cidade, só pode trabalhar a distancia.\n\n");
		}
	}
	
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Gabriele";
		f1.idade= 21;
		f1.sexo= "feminino";
		f1.cidade= "São Paulo";
		f1.status();
		f1.moraAqui();
		
		
		Funcionario f2 = new Funcionario();
		f2.nome = "João";
		f2.idade= 25;
		f2.sexo= "masculino";
		f2.cidade= "Salvador";
		f2.status();
		f2.moraAqui();
	}

}
