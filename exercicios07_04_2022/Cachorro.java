package exercicios07_04_2022;

public class Cachorro extends Animal {
	
		void correr() {
		System.out.println("Este animal corre");	
		}
		
		
		public static void main(String[] args) {
			
			Cachorro cac = new Cachorro();
			
			cac.setNome("Alonso");
			cac.setIdade(10);
			
			System.out.println(cac.toString());
			
			cac.emitirSom();
			cac.correr();
			
			
			
			
			
			
			
			
			
		
	}

		}


