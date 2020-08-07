package PacoteJava;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade =0,hora=0,minutos=0,seg;			
		System.out.println("Digite a quantidade de dias ");
		seg = ler.nextInt();
		
		while (seg >=3600) {
			hora++;
			seg = seg - 3600;
		}
		while (seg>=60) {
			minutos++;
			seg = seg-60;
		}
		
		
		System.out.println("A duracao é "+hora+" anos "+minutos+" meses "+seg+ " dias ");
	}
}