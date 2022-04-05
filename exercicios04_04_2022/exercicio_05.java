package exercicios04_04_2022;

import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num, soma=0;
		
		System.out.print("Digite um número: ");
		num=ler.nextInt();
		soma=soma+num;
		
		do {
			
			System.out.print("Digite um número: ");
			num=ler.nextInt();
			soma=soma+num;
			
		}
		while(num!=0);
	System.out.print("\nA soma dos números digitados é: "+soma+".");
	}

}
