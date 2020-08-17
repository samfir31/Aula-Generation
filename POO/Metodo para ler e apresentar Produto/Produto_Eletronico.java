package Pac;

public class Produto_Eletronico {
	private String modelo;
	private String SN;	
	
	public Produto_Eletronico() {
		
	}
	
	void apresenta() {
		System.out.println(""+SN);
		System.out.println(""+modelo);
		
	}
	void sn () {
		System.out.println("Digite o serial");
	}
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getSN() {
		return SN;
	}

	public void setSN(String sN) {
		SN = sN;
	}

	void mod () {
		System.out.println("Digite o modelo");
	}
}
