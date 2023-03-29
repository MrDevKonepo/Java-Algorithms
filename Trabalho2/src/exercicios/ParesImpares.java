/* Construa um programa que armazene 15 números e um vetor e imprima uma listagem numerada 
 * contendo o número e uma das mensagens: par ou ímpar.
 * */

package exercicios;

import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[15];
		
		for(int i = 0; i < 15; i++) {
			System.out.print(i + 1 + "° número: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("");
		for(int i = 0; i < 15; i++) {
			if(numeros[i] % 2 == 0) {
				System.out.println(numeros[i] + " - " + "PAR");
			}else {
				System.out.println(numeros[i] + " - " + "ÍMPAR");
			}
		}
		
		sc.close();

	}

}

