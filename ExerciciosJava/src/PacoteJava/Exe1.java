//Faça um programa que receba três inteiros e diga qual deles é o maior.//
package PacoteJava;

import java.util.Scanner;

public class Exe1 {
	public static void main (String[] args) {	
	int[] num = new int [3];
	int[] ordem = new int [3];	
	Scanner ler = new Scanner(System.in);
	
	for (int i=0; i<3;i++) {
		System.out.println("Digite o numero");
		num[i] = ler.nextInt();
	}
	if (num[0]<num[1]){
		ordem[0]=num[0];
	} else ordem[0]=num[1];
		if (num[0]<num[2]){
			ordem[0]=num[0];
		} else ordem[0]=num[2];
	if (num[1]<num[0]){
		ordem[1]=num [1];
	} else ordem[1]=num[0];
		if (num[1]<num[2]){
			ordem[1]=num[1];
		} else ordem[1]=num[2];
	if (num[2]<num[0]){
		ordem[2]=num[2];
	} else ordem[2]=num[0];
		if (num[2]<num[1]){
			ordem[2]=num[2];
		} else ordem[2]=num[1];
		System.out.println("Em ordem crescente"+ordem[0]+ordem[1]+ordem[2]);
}
}