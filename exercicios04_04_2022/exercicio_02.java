package exercicios04_04_2022;

import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int n, par=0, impar=0; 
	
		for(int num=0; num<=9; num++) {
			System.out.print("Digite um némero: ");
			n=leia.nextInt();
			
			if(n%2==0) {
				par=par+1;
			}
			else {
				impar=impar+1;
			}
			}
		
		System.out.print(par + " números pares e "+ impar+ " números ímpares.");
	}

}
