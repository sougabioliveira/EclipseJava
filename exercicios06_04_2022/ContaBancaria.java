package exercicios06_04_2022;

/*
 6) Crie uma classe conta bancaria e apresente os atributos e m�todos referentes esta classe,
  em seguida crie um objeto conta bancaria, defina as instancias deste objeto e apresente as informa��es deste objeto no console.
 */


public class ContaBancaria {
	
	int agencia;
	int conta;
	String instituicaoFinanceira;
	double saldo;
	
	
	void status() {
		System.out.println("Qual a agencia: "+this.agencia);
		System.out.println("Qual a conta: "+this.conta);
		System.out.println("Institui��o financeira: "+this.instituicaoFinanceira);
	}
	
	void sacar(double quantia) {
		if(this.saldo<=0) {
			System.out.println("\nN�o � possivel sacar, a conta est� zerada.");
		} else {
			this.saldo-=quantia;	
		}
		
	}
	
	void depositar(double quantia) {
		this.saldo+=quantia;
		System.out.println("\nDep�sito realizado.");
	}
	
	void checarSaldo() {
		System.out.println("Saldo da conta � R$ "+this.saldo);
	}
	

	public static void main(String[] args) {
		
		ContaBancaria cB1 = new ContaBancaria();
		
		cB1.agencia= 3999;
		cB1.conta= 333656565;
		cB1.instituicaoFinanceira= "Ita�";
		cB1.saldo= 0;
		cB1.status();
		cB1.checarSaldo();
		cB1.sacar(20);
		cB1.depositar(50);
		cB1.checarSaldo();
		
				
		

	}

}
