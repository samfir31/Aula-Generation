package pca;

public class Fornecedor extends Pessoa{
	private int valorCredito;
	private int valorDivida;
	
	public Fornecedor() {
		
	}
	
	public int obterSaldo() {
		valorCredito = valorCredito-valorDivida;
		return valorCredito;
	}
}
