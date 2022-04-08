package exercicios07_04_2022;

public class Cavalo extends Animal {
	
		void correr() {
			System.out.println("Este animal galopa");
		}
		
		
		public static void main(String[] args) {
			
			Cavalo cav = new Cavalo();
			
			cav.setNome("Aloísio");
			cav.setIdade(8);
			
			System.out.println(cav.toString());
			
			cav.emitirSom();
			cav.correr();
		}
		

}
