package exercicios01_04_2022;

import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int suaIdade;
		
		System.out.print("Digite sua idade: ");
		suaIdade=leia.nextInt();
		
		if(suaIdade<=9) {
			System.out.print("\nFalta pouco para que voc� entre na categoria infantil ;D");
		}
		
		else if(suaIdade>=10&&suaIdade<=14) {
			System.out.print("\nVoc� est� na categoria infantil!");
		}
		
		else if(suaIdade>=15&&suaIdade<=17) {
			System.out.print("\nVoc� est� na categoria juvenil!");
		}
		else if(suaIdade>=18&&suaIdade<=25) {
			System.out.print("\nVoc� est� na categoria adulto!");
		}
		else {
			System.out.print("\nVoc� n�o se encaixa em uma categoria :(");
		}

}
}
