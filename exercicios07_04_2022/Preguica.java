package exercicios07_04_2022;

public class Preguica extends Animal {
	
	void subirArvore() {
		System.out.println("Este animal sobe em �rvores.");
	}
	
	public void emitirSom() {
		System.out.println("____________ - permanece no mais completo sil�ncio!");
	}
	
	public static void main(String[] args) {
		
		Preguica pre = new Preguica();
		
		pre.setNome("Vivian");
		pre.setIdade(14);
		
		System.out.println(pre.toString());
		
		pre.subirArvore();
		pre.emitirSom();
		
	}
	
	
}


