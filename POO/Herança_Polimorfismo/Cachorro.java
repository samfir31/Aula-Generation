package Herança_Polimorfismo;

public class Cachorro extends Animal{
	private String correr;
	
	public Cachorro() {
		
	}
	public Cachorro(String correr) {
	this.correr = correr;
	}
	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
}
