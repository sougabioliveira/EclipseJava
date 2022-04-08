package exercicios07_04_2022;

public class Cavalo extends Animal {
	
		void correr() {
			System.out.println("Este animal galopa");
		}
		
		public void emitirSom() {
			System.out.println("relinchar relinchar relinchar!");
		}
		
		
		public static void main(String[] args) {
			
			Cavalo cav = new Cavalo();
			
			cav.setNome("Aloísio");
			cav.setIdade(8);
			
			System.out.println(cav.toString());
			
			cav.correr();
			cav.emitirSom();
			
		}
		

}
