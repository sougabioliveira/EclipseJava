package exercicios01_04_2022;

import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				
		int num;
		
		System.out.print("Digite um número: ");
		num=leia.nextInt();
		
		if(num%2==0) {
			System.out.print("\n\nO número "+num+" é par.");
			System.out.print("\nSua raiz quadrada é: "+ (int)Math.sqrt(num) +".");
		}
		else {
			System.out.print("\n\nO número "+num+" é ímpar.");
			System.out.print("\nO número "+num+" ao quadrado é: "+num*num+".");
		}
				
			
	}

}
