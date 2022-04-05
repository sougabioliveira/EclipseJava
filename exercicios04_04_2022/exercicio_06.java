package exercicios04_04_2022;

import java.util.Scanner;

public class exercicio_06 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num, cont=0, soma=0, media=0, resto=0;
		
		System.out.print("Escreva um número: ");
		num=ler.nextInt();
		
		
		do {
			System.out.print("Escreva um número: ");
			num=ler.nextInt();
			resto=num%3;
			
			if(resto==0 && num!=0) {
				soma=soma+num;
				cont=cont+1;
				
			}
		
		}
			while(num!=0);
		
		
	
		System.out.print("\nA média dos números multiplos de 3 é: "+soma/cont+".");

	}

}
