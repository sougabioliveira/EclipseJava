package byteBank;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo=200;
		primeiraConta.agencia=6688;
		primeiraConta.numero=8877;
		primeiraConta.titular= "Gabi";
		System.out.print("Agencia: "+ primeiraConta.agencia+ "\nConta:"+ primeiraConta.numero+"\nTitular: "+primeiraConta.titular+"\nSaldo da conta: "+primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("\nAtualização do saldo: "+primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		segundaConta.agencia=6688;
		segundaConta.numero=9977;
		segundaConta.titular= "Guilherme";
		System.out.print("\n\nAgencia: "+ segundaConta.agencia+ "\nConta:"+ segundaConta.numero+"\nTitular: "+segundaConta.titular+"\nSaldo da conta: "+segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("\nAtualização do saldo: "+ segundaConta.saldo);
		
		
	}

}
