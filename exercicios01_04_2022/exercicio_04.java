package exercicios01_04_2022;

import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				
		int num;
		
		System.out.print("Digite um n�mero: ");
		num=leia.nextInt();
		
		if(num%2==0) {
			System.out.print("\n\nO n�mero "+num+" � par.");
			System.out.print("\nSua raiz quadrada �: "+ (int)Math.sqrt(num) +".");
		}
		else {
			System.out.print("\n\nO n�mero "+num+" � �mpar.");
			System.out.print("\nO n�mero "+num+" ao quadrado �: "+num*num+".");
		}
				
			
	}

}
