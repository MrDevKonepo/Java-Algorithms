package exercicios;

import java.util.Arrays;
import java.util.Scanner;

// Crie um programa que pergunte três valores distintos e os imprima em ordem crescente.

public class OrdemCrescente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[3];
		
		extracted(sc, numeros);		
		
		Arrays.sort(numeros);
		
		System.out.print("Valores em order crescente: ");
		extracted(numeros);
			
		sc.close();
	
	}

	private static void extracted(Scanner sc, int[] numeros) {
		for(int i = 0; i < 3; i++) {
			System.out.print(i + 1 + "° número: ");
			numeros[i] = sc.nextInt();
		}
	}
	
	private static void extracted(int[] numeros) {
		for(int i = 0; i < 3; i++ ) {
			System.out.print(numeros[i] + " ");
		}
	}
}
