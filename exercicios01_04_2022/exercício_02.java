package exercicios01_04_2022;

import java.util.Scanner;

public class exerc�cio_02 {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3, aux;
		
		
		System.out.print("Digite o primeiro n�mero: ");
		num1=leia.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		num2=leia.nextInt();
	
		System.out.print("Digite o terceiro n�mero: ");
		num3=leia.nextInt();
		
		System.out.print("\n\nA ordem crescente dos n�meros citados �:");
		
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
