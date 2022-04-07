package exercicios06_04_2022;

/*
5. Crie uma classe patinete e apresente os atributos e métodos referentes 
 esta classe, em seguida crie um objeto patinete, defina as instancias deste 
 objeto e apresente as informações deste objeto no console.
 */

public class Patinete {
	
	String modelo;
	String cor;
	String tamanho;
	boolean parado;

	void atributos() {
		System.out.print("\nModelo do patinete: "+this.modelo);
		System.out.print("\nCor: "+this.cor);
		System.out.print("\nTamanho: "+ this.tamanho);
		
	} 
		
	void andar() {
		this.parado = false;
		System.out.print("\n\nO patinete começou a andar.\n\n");
	}
	
	void parar() {
		this.parado = true;
		System.out.print("\n\nO patinete vai parar.\n\n");
	}
	
	void status() {
		if(this.parado) {
			System.out.print("\n\nO patinete está estacionado.\n\n");	
		} else { 
			System.out.print("\n\nO patinete está andando por aí!\n\n");
		}
	}
	
	public static void main(String[] args) {
		
		Patinete p1 = new Patinete();
		
		p1.modelo="PT13";
		p1.cor="vermelho";
		p1.tamanho="adulto";
		p1.atributos();
		p1.andar();
		p1.status();
		
		p1.parar();
		p1.status();
		
	}

}
