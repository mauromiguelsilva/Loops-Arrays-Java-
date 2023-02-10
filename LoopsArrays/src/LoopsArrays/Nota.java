package LoopsArrays;

import java.util.Scanner;

public class Nota {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double nota;

		System.out.println("Informe a nota");
		nota = scan.nextDouble();

		while (nota < 0 || nota > 10) {
			System.out.println("Nota invalida informe novamente ");
			nota = scan.nextDouble();

		}

	}

}
