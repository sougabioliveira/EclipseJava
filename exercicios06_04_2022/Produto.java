package exercicios06_04_2022;

/*
 3) Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, 
 em seguida crie um objeto produto eletrônico, defina as instancias deste objeto e apresente as informações deste objeto no console.
 */

public class Produto {
	
		String modelo;
		String cor;
		int ano;
		String marca;
		String operadora;
		boolean bateria;
		
		void status(){
			
			System.out.print("\n\nQual o modelo do celular? "+this.modelo);
			System.out.print("\nQual a marca deste celular? "+this.marca);
			System.out.print("\nQual a cor desse modelo? " + this.cor);
			System.out.print("\nEm que ano ele foi comprado? "+this.ano);
			System.out.print("\nQual a operadora? "+this.operadora);
			
		}
			
		void funcionamento () {
			System.out.print("\nQual o estado da bateria? ");
			
			if(bateria==true) {
				System.out.print("\nMeu celular segue em perfeito funcionamento!\n\n");}
			else {
				System.out.print("\nBateria ruim é a minha! =(\n\n");
			}
		}
			
		void bateriaBoa() {
			this.bateria= true;
		}
			
		void bateriaRuim() {
			this.bateria=false;
		}
		
		
		
		public static void main(String[] args) {
			
			Produto cel1 = new Produto();
			Produto cel2 = new Produto();		
					
			cel1.modelo = "S9";
			cel1.cor= "Preto";		
			cel1.ano= 2018;
			cel1.marca= "Samsung";
			cel1.operadora= "Vivo";
			cel1.bateriaBoa();
			cel1.status();
			cel1.funcionamento();
			
			cel2.modelo = "S21";
			cel2.cor= "Rosa";		
			cel2.ano= 2020;
			cel2.marca= "Samsung";
			cel2.operadora= "Claro";
			cel2.bateriaRuim();
			cel2.status();
			cel2.funcionamento();
			
			
		}

}
