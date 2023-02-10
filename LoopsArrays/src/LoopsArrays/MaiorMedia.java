package LoopsArrays;

import java.util.Scanner;

public class MaiorMedia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int count =0;
		int maior = 0;
		int soma = 0;
	do {
		System.out.println("Informe o numero");
		numero = scan.nextInt();
		soma = soma+numero;
		if(numero > maior) maior = numero;
		count = count+1;
	}while(count <5);
	
	System.out.println("Maior numero é "+ numero);
	System.out.println("A Media entre os numeros é " + (soma/5));
	
	}
}
