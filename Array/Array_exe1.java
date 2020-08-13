package PacoteJava;

import java.util.Scanner;

public class Array_exe1 {

	public static void main(String[] args) {
		int v[] = new int[6],
		SPar=0,QImpar=0;
		int vetorpar[]=new int[6];
		Scanner ler = new Scanner(System.in);						
		for(int x=0;x<6;x++)
			{
			System.out.println("Digite o valor: ");
			v[x] = ler.nextInt();							
				if(v[x]%2==0)
					{
						vetorpar[x]=v[x];
						System.out.println("\nPar: "+v[x]);
						SPar = SPar+v[x];
					}
				else
					{
						System.out.println("\nImpar: "+v[x]);
						QImpar++;
					}
						}
						System.out.println("\nSoma dos números pares: "+SPar);
						System.out.println("\nQuantidade de impares: "+QImpar);
						
			for(int x=0;x<6;x++)
			{
				if(v[x]%2==0)
						{
				System.out.printf("\nPar: %d",v[x]);
			}
			}						
			for(int x=0;x<6;x++)
			{
				if(v[x]%2==1)
			{
					System.out.printf("\nImpar: %d",v[x]);
			}
			}
			for(int x=0;x<6;x++)
			{
			System.out.println(vetorpar[x]);
			}
					}
				


	
}
