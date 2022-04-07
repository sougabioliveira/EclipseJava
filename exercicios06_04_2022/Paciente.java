package exercicios06_04_2022;

/*
 7) Crie uma classe paciente e apresente os atributos e métodos referentes esta classe, 
 em seguida crie um objeto paciente, defina as instancias deste objeto e apresente as informações deste objeto no console.
 */

public class Paciente {
	
		String nome;
		int idade;
		boolean medicado;
		
		void status() {
			
			System.out.println("Nome do paciente: "+this.nome);
			System.out.println("Idade: "+this.idade);
		}
		
		void atender() {
			System.out.println("Paciente será medicado.");
			this.medicado=true;
		}
		
		void darAlta() {
			if(this.medicado==true) {
			System.out.println("Paciente já foi medicado, pode ir para casa!");
		}
			else {
				System.out.println("Medicá-lo, imediatamente!");
			}
		}
	
	
	public static void main(String[] args) {
		
		Paciente p1 = new Paciente();
		
		p1.nome= "Geovanna";
		p1.idade= 23;
		p1.status();
		p1.darAlta();
		p1.atender();
		p1.darAlta();
	}

}
