package LoopsArrays;

import java.util.Scanner;

public class PareImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int quantnumeros;
		int numero;
		int impar = 0, par = 0;

		System.out.println("quantidade de numeros:");
		quantnumeros = scan.nextInt();

		int count = 0;

		do {
			System.out.println("Numero:");
			numero = scan.nextInt();
			if (numero % 2 == 0)
				par++;

			else
				impar++;

			count++;

		} while (count < quantnumeros);

		System.out.println("Quantidade de pares :" + par);
		System.out.println("Quantidade de impares :" + impar);
	}
}
