package LoopsArrays;

import java.util.Random;

public class NumerosAleatorios {
	public static void main(String[] args) {
		Random random = new Random();

		int[] numerosAleatorios = new int[20];

		for (int i = 0; i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;

		}
		System.out.println("Numeros Aleatorios : ");
		for (int numero : numerosAleatorios) {
			System.out.println(numero + " ");
		}

		System.out.println("\n Sucessores dos Numeros Aleatorios : ");
		for (int numero : numerosAleatorios) {
			System.out.println((numero + 1) + " ");
		}
		System.out.println("\n Antecessores dos Numeros Aleatorios : ");
		for (int numero : numerosAleatorios) {
			System.out.println((numero - 1) + " ");
		}

	}

}
