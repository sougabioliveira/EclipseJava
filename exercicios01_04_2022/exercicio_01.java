package exercicios01_04_2022;

import java.util.Scanner;

public class exercicio_01 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3, maiorNum;
		
		
		System.out.print("Digite o primeiro n�mero: ");
		num1=leia.nextInt();
		
		System.out.print("\nDigite o segundo n�mero: ");
		num2=leia.nextInt();
	
		System.out.print("\nDigite o terceiro n�mero: ");
		num3=leia.nextInt();
	
		if(num1>num2 && num1>num3) {
			maiorNum=num1;
			}
					
			else if(num2>num1 && num2>num3) {
				maiorNum=num2;
			}
				
				else {
					maiorNum=num3;
				}
			
					
		System.out.print("\n\nO maior n�mero �: "+maiorNum);
	}
}
