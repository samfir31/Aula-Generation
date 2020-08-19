package Herança_Polimorfismo;

public class Principal {
	public static void main(String args[]) {
	Cavalo cavalo = new Cavalo();
	Cachorro cachorro = new Cachorro();
	Preguica preguica = new Preguica();
	cavalo.setNome("Pangaré");
	cavalo.setIdade(5);
	cavalo.setSom("iii");
	cavalo.setCorrer("Corre muito");
	
	cachorro.setNome("Magrelin");
	cachorro.setIdade(3);
	cachorro.setSom("Auau");
	cachorro.setCorrer("Corre um pouco");
	
	preguica.setNome("Preguicinha");
	preguica.setIdade(20);
	preguica.setSom("xiiiiu");
	preguica.setSubirArvore("Sobe lentamente");
	
	
	System.out.println("O nome do cachorro "+cavalo.getNome()+", tem "+cavalo.getIdade()+" de idade, emite o som "+cavalo.getSom()+" e "+cavalo.getCorrer());
	System.out.println("O nome do cachorro "+cachorro.getNome()+", tem "+cachorro.getIdade()+" de idade, emite o som "+cachorro.getSom()+" e "+cachorro.getCorrer());
	System.out.println("O nome do cachorro "+preguica.getNome()+", tem "+preguica.getIdade()+" de idade, emite o som "+preguica.getSom()+" e "+preguica.getSubirArvore());
}
}