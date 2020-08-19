package Herança_Polimorfismo;

public class Preguica extends Animal {
	private String subirArvore;
	
	public Preguica() {
		
	}
	
public Preguica(String subirArvore) {
		this.subirArvore = subirArvore;
	}

	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}
	
}
