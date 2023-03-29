/* Construa um programa que permita armazenar o salário de 20 pessoas.
 * Calcular e armazenar o novo salário sabendo - se que o reajuste foi de 8%.
 * Imprimir uma listagem numerada contendo: salário antigo, novo salário, diferença em valor;
 * ao final mostre o total de cada coluna(vetor). Declare quantos vetores forem necessários.
 * */

package exercicios;

import java.util.Scanner;

public class ReajusteSalario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] salariosAntigos = new double[20], salariosNovos = new double[20];
		
		for(int i = 0; i < 20; i++) {
			System.out.print("Funcionário: " + (i + 1) + ": ");
			salariosAntigos[i] = sc.nextDouble();
		}
		
		System.out.println("");
		for(int i = 0; i < 20; i++) {
			salariosNovos[i] = salariosAntigos[i] + (salariosAntigos[i] * 8 / 100);
			System.out.println(i + 1 + "° salário => "
							 + "Antigo: "       + salariosAntigos[i] 
							 + " > Novo: "      + salariosNovos[i] 
							 + " > Diferença: " + (salariosNovos[i] - salariosAntigos[i]));
		}
				
		sc.close();

	}

}
