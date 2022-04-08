package exercicios07_04_2022;

public class Cachorro extends Animal {
	
		void correr() {
		System.out.println("Este animal corre");	
		}
		
		public void emitirSom() {
			System.out.println("au au au au au!");
		}
		
		public static void main(String[] args) {
			
			Cachorro cac = new Cachorro();
			
			cac.setNome("Alonso");
			cac.setIdade(10);
			
			System.out.println(cac.toString());
			
			cac.correr();
			cac.emitirSom();
			
			
			
			
			
			
			
			
			
			
		
	}

		}


