package exercicios06_04_2022;

/*
2. Crie uma classe avi�o e apresente os atributos e m�todos referentes esta 
 classe, em seguida crie um objeto avi�o, defina as instancias deste objeto e 
 apresente as informa��es deste objeto no console.
 */

import java.util.Scanner;

public class Aviao {

		
		String modelo;
		int ano;
		String companhiaAerea;
		boolean atividade;
		
		
		void status(){
			System.out.print("Qual o modelo do avi�o?\n"+ this.modelo);
			System.out.print("\nQual o ano desse modelo? \n"+ this.ano);
			System.out.println("\nEle est� em qual companhia a�rea? \n" + this.companhiaAerea);
			System.out.print("\nEste avi�o ainda est� em atividade? \n"+this.atividade);
		}
		
		void statusAtividade() {	
			if(atividade == true){
				System.out.print("\nEste modelo est� em atividade!\n\n\n");
		} 
			else {
				System.out.print("\nEste avi�o n�o est� mais em atividade!\n\n\n");	
		}
			
		}
		
		
		public static void main(String[] args) {
			
			System.out.print("Quer saber??\n\n");
			
			Aviao a1 = new Aviao();
			Aviao a2 = new Aviao();
			
			a1.modelo="Boeing";
			a1.ano= 2020;
			a1.companhiaAerea= "Gol";
			a1.atividade= true;
			a1.status();
			a1.statusAtividade();
		
			a2.modelo="14 Bis";
			a2.ano= 1906;
			a2.companhiaAerea= "Nenhuma";
			a2.atividade= false;
			a2.status();
			a2.statusAtividade();

		
		}
}
