package Pac;

import java.util.Scanner;

public class Principa {
	public static void main (String args[]) {
		String cor, modelo;
		Scanner ler = new Scanner (System.in);
		Aviao aviao = new Aviao ();
		aviao.co();
		cor = ler.next();
		aviao.setCor(cor);
		aviao.mod();
		modelo = ler.next();
		aviao.setModelo(modelo);
		aviao.apresenta();
		aviao.abastecer();
		aviao.Ligar();
		
	}
}
