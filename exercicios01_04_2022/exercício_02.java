package exercicios01_04_2022;

import java.util.Scanner;

public class exercício_02 {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3, aux;
		
		
		System.out.print("Digite o primeiro número: ");
		num1=leia.nextInt();
		
		System.out.print("Digite o segundo número: ");
		num2=leia.nextInt();
	
		System.out.print("Digite o terceiro número: ");
		num3=leia.nextInt();
		
		System.out.print("\n\nA ordem crescente dos números citados é:");
		
		if(num1>num2) {
			aux=num1;
			num1=num2;
			num2=aux;
		}

		if(num1>num3) {
			aux=num1;
			num1=num3;
			num3=aux;
		}

		if(num2>num3) {
			aux=num2;
			num2=num3;
			num3=aux;
		}
		
		System.out.print("\n"+num1+"\n"+num2+"\n"+num3);	
	}

}
