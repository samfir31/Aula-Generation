package PacoteJava;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int idade =0,ano=0,mes=0,dias;			
		System.out.println("Digite a quantidade de dias ");
		dias = ler.nextInt();
		
		while (dias >=365) {
			ano++;
			dias = dias - 365;
		}
		while (dias>=30) {
			mes++;
			dias = dias-30;
		}
		
		
		System.out.println("A é "+ano+" anos "+mes+" meses "+dias+ " dias ");
	}
	}


