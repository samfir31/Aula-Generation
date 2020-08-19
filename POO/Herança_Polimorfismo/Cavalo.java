package Herança_Polimorfismo;

public class Cavalo extends Animal {
	private String correr;
	
	public Cavalo() 
	{
		
	}
	public Cavalo(String correr) 
	{
		this.correr = correr;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
}
