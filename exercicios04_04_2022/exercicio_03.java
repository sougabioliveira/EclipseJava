package exercicios04_04_2022;

import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int age=0, mais=0, menos=0;
	
		System.out.print("Digite a idade da pessoa: ");
		age=ler.nextInt();
		
		while(age!=-99)
	{	
			
		if(age<=21) {
			mais=mais+1;
		}
		if(age>=50) {
			menos=menos+1;
		}
		System.out.print("Digite a idade da pessoa: ");
		age=ler.nextInt();
		
	}
	
	System.out.print("Total de pessoas com menos de 21 anos é "+mais+" e total de pessoas com mais de 50 anos é "+menos+".");
	}

}
