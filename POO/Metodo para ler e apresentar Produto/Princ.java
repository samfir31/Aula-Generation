package Pac;

import java.util.Scanner;

public class Princ {

	public static void main(String[] args) {
		String sn,modelo;		
		Scanner ler = new Scanner(System.in);
		Produto_Eletronico produto = new Produto_Eletronico();
		
		produto.sn();
		sn = ler.next();
		produto.setSN(sn);
		produto.mod();
		modelo = ler.next();
		produto.setModelo(modelo);
	}

}
