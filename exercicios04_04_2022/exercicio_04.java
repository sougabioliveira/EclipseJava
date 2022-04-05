package exercicios04_04_2022;

import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		System.out.print("PESQUISA DE CARACTERÍSTICA PSICOLÓGICAS\n");

		Scanner ler = new Scanner(System.in);
		
		int idade, sexo, persona=0, contCalm=0, contMN=0, contHA=0, contOC=0, contN40=0, contC18=0, soma=0;
		
		
		System.out.print("\nQual a sua idade? ");
		idade=ler.nextInt();
		System.out.print("Qual o seu sexo? (Digite 1 - feminino, 2 - masculino e 3 - outros).");
		sexo=ler.nextInt();
		System.out.print("Qual a sua personalidade? (Digite 1 - CALMA, 2 - NERVOSA e 3 - AGRESSIVA).");
		persona=ler.nextInt();
		
		if(persona==1) {
		 	contCalm=contCalm+1;
		}
		
		if(sexo==1&&persona==2) {
			contMN=contMN+1;
		}
		
		if(sexo==2&&persona==3) {
			contHA=contHA+1;
		}
		
		if(sexo==3&&persona==1) {
			contOC=contOC+1;
		}
		
		if(persona==2&&idade>=40) {
			contN40=contN40+1;
		}
		
		if(persona==1&&idade<=18) {
			contC18=contC18+1;
		}
		
		soma=soma+1;
	
		
		while(soma<=150) {
			
			
			
			System.out.print("\nQual a sua idade? ");
			idade=ler.nextInt();
			System.out.print("Qual o seu sexo? (Digite 1 - feminino, 2 - masculino e 3 - outros).");
			sexo=ler.nextInt();
			System.out.print("Qual a sua personalidade? (Digite 1 - CALMA, 2 - NERVOSA e 3 - AGRESSIVA).");
			persona=ler.nextInt();
			soma=soma+1;
			
			if(persona==1) {
			 	contCalm=contCalm+1;
			}
			
			if(sexo==1&&persona==2) {
				contMN=contMN+1;
			}
			
			if(sexo==2&&persona==3) {
				contHA=contHA+1;
			}
			
			if(sexo==3&&persona==1) {
				contOC=contOC+1;
			}
			
			if(persona==2&&idade>=40) {
				contN40=contN40+1;
			}
			
			if(persona==1&&idade<=18) {
				contC18=contC18+1;
			}
			
			
		}
		
		System.out.print("\nO número de pessoas calma é: "+contCalm);
		System.out.print("\nO número de mulheres nervosas é: "+contMN);
		System.out.print("\nO número de homens agressivos é: "+contHA);
		System.out.print("\nO número de outros calmos é: "+contOC);
		System.out.print("\nO número de pessoas nervosas com mais de 40 anos é: "+contN40);
		System.out.print("\nO número de pessoas calmas com menos de 18 anos: "+contC18);
	}

}
