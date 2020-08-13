/*Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/

package PacoteJava;

import java.util.Scanner;

public class Array_exe3 {
	public static void main (String args[]) {
	int[][] m = new int [3][3];
	int cont=0;
	Scanner ler = new Scanner(System.in);
	
	for (int i = 0; i<3; i++) {
		for(int j =0; j<3; j++) {
		System.out.println("Digite o numero");
		m[i][j]= ler.nextInt();
		if (m[i][j]>10) {			
			cont++;
		}
		}
	}
	System.out.println("A matriz possui "+cont+" numeros maiores que 10!!");
	
			
		
}}
