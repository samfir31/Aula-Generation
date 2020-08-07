package PacoteJava;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int idade =0,ano,mes,dias;	
		System.out.println("Digite a quantidade de anos");
		ano = ler.nextInt();
		System.out.println("Digite a quantidade de meses");
		mes = ler.nextInt();
		System.out.println("Digite a quantidade de dias ");
		dias = ler.nextInt();
		
		if (ano >0) {
			idade = 365*ano;			
		}
		if (mes>0) {
			idade =idade+(mes*30);
		}
		if (dias>0) {
			idade= idade+dias;
		}
		
		System.out.println("A idade expressa em dias é: "+idade);
	}

}
	