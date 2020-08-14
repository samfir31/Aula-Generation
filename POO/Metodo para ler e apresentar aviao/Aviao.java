package Pac;

public class Aviao {
	private String modelo;
	private String cor;	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Aviao() {
		
	}
	void abastecer() {
			
			System.out.println("Abastecido");
		
			
		}
	
	
	void Ligar (){
		System.out.println("ligado");
	}
	
	void co () {
		System.out.println("Digite a cor");
	}
	void mod () {
		System.out.println("Digite o modelo");
	}
	
	void apresenta() {
		System.out.println(""+cor);
		System.out.println(""+modelo);
		
	}
	}