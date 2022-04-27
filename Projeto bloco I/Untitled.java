package projetoBloco1; // Pasta onde está salvo o projeto.

public interface FabricaDeCanetas { // Nome da Classe interface
	
	// Interface com os métodos da classe
	public abstract void tamparCaneta();
	public abstract void destamparCaneta();
	public abstract void escrever();
	public abstract void testar();
	public abstract void recarregarCaneta();
	public abstract void statusDaCaneta();
	public abstract double precificar(double material, double cor);
	public abstract double precificar(double material, double cor1,double cor2, double cor3, double cor4);

}


package projetoBloco1; // Pasta onde está salvo o projeto.

/*
 *  Nome da classe mãe e a interface de onde ela puxa os métodos
 */
public abstract class Caneta implements FabricaDeCanetas  { 
	// atributos da classe mãe que são passados para todas as classes filhas
	private int carga; 
	 private double quantidadeDeCor;
	 private double preco;
	 private double ponta;
	 private String cor; 
	 private String tipoDeTinta;
	 private boolean tampa;	 
	 private boolean unicornio;	 
	 
	// A partir daqui temos os métodos
	 

	@Override // Método para tampar a caneta
	public void tamparCaneta()
	{
		this.tampa=false;	
	}

	@Override // Metodo para destampar a caneta
	public void destamparCaneta()
	{
		this.tampa=true;
	}

	@Override // Método para escrever e toda vez que escreve tira 1 de carga
	public void escrever() {
		if(tampa==false)
			System.out.println("Erro caneta com tampa.");
		else
		{
			System.out.println("Escrevendo...");
			carga=this.getCarga()-1;
			this.setCarga(carga);
		}
	}

	@Override // Método para testar a caneta quando está sem carga não escreve
	public void testar() {
		if(this.getCarga()<1)
			System.out.println("Caneta sem tinta");
		else
		this.escrever();
		
	}

	@Override // Método sobrecarga para atribuir preço ao produto
	public double precificar(double material, double cor)
	{
		this.setPreco(material+cor);
		return this.getPreco();			
	}
	
	public double precificar(double material, double cor1,double cor2, double cor3, double cor4)
	{
		this.setPreco(material+cor1+cor2+cor3+cor4);
		return this.getPreco();			
	}
	
	@Override // Método com o status da caneta.
	public void statusDaCaneta() {
		System.out.println("A carga está em "+this.getCarga()+"%");
		System.out.println("A cor da caneta é "+this.getCor());
		if(this.isTampa()==false)
			System.out.println("A caneta está tampada");
		else
			System.out.println("A caneta não está tampada");
	}

	@Override // Método com o status da caneta.
	public void recarregarCaneta() {
		for(int carga=this.getCarga(); carga<=100; carga++)
		{
			this.setCarga(carga);
			System.out.print(this.getCarga()+" ");
		}
		System.out.println("");
	}

	// Getter e setters servem para encapsular os atributos e alterar o seu valor.	
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public double getQuantidadeDeCor() {
		return quantidadeDeCor;
	}

	public void setQuantidadeDeCor(double quantidadeDeCor) {
		this.quantidadeDeCor = quantidadeDeCor;
	}
	public double getPonta() {
		return ponta;
	}

	public void setPonta(double ponta) {
		this.ponta = ponta;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipoDeTinta() {
		return tipoDeTinta;
	}

	public void setTipoDeTinta(String tipoDeTinta) {
		this.tipoDeTinta = tipoDeTinta;
	}

	public boolean isTampa() {
		return tampa;
	}

	public void setTampa(boolean tampa) {
		this.tampa = tampa;
	}

	public boolean isUnicornio() {
		return unicornio;
	}

	public void setUnicornio(boolean unicornio) {
		this.unicornio = unicornio;
	}
	
	
}


package projetoBloco1;

public class CanetaEsferografica extends Caneta {
	// Metodo criador
	public CanetaEsferografica()
	{
		this.getCor(); // pega a cor atribuida a este obejeto quando for criado.
		this.getPonta(); // pega a ponta atribuida a este obejeto quando for criado.
		this.isTampa(); // pega o status da tampa quando for criado.
		this.getPreco(); // atribui preço a este obejeto quando for criado.
	}

}
