/* Nota Conceito: desenvolva um programa que leia o número de identificação, 
 * as 3 notas obtidas por um aluno nas 3 verificações e a média dos exercícios 
 * que fazem parte da avaliação.
 * 
 * Calcular a média de aproveitamento, usando a fórmula: MA = (Nota1 + Nota2 x2 + Nota3 x3 + ME) / 7
 * 
 * A atribuição de conceitos obedece a tabela abaixo:
 * 
 * Média de aproveitamento	     Conceito
 * >= 9,0							A
 * >= 7,5 e < 9,0					B
 * >= 6,0 e < 7,5					C
 * >= 4,0 e < 6,0					D
 *  < 4,0	 						E
 *
 * O algoritmo deve escrever o número do aluno, suas notas, a média dos exercícios, a média de aproveitamento,
 * conceito correspondente e amensagem: APROVADO se o conceito for A, B ou C 
 * e REPROVADO se o conceito for D ou E.
 * 
 * */

package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaAproveitamento {

	public static void main(String[] args) {
		
		double[] notasAluno = new double[3];
		int[] nroIdentificacao = new int[3];
		double mediaExercicios = 0.00;
		String conceito, resultado;
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.print("Número do aluno: ");
		int nroAluno = sc.nextInt();
		
		for(int i = 0; i < 3; i++) {
			System.out.print("Nota " + (i + 1) + ": ");
			notasAluno[i] = sc.nextDouble();
			
			nroIdentificacao[i] = i;
			
			mediaExercicios += notasAluno[i];
		}
	
		mediaExercicios = mediaExercicios / 3;
		
		double mediaAproveitamento = (notasAluno[0] + notasAluno[1] * 2 + notasAluno[2] * 3 + mediaExercicios) / 7;
		
		if(mediaAproveitamento > 9.0) {
			conceito = "A";
		}else if(mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.00) {
			conceito = "B";
		}else if(mediaAproveitamento >= 6.00 && mediaAproveitamento < 7.5) {
			conceito = "C";
		}else if(mediaAproveitamento >= 4.0 && mediaAproveitamento < 6.00) {
			conceito = "D";
		}else {
			conceito = "E";
		}
		
		if(conceito == "D" || conceito == "E") {
			resultado = "REPROVADO";
		}else {
			resultado = "APROVADO";
		}
		
		System.out.printf("\nNúmero do aluno: " + nroAluno 
							+ "\nNota "  + (nroIdentificacao[0] + 1) + " = " + notasAluno[0]
							+ "\nNota "  + (nroIdentificacao[1] + 1) + " = " + notasAluno[1]
						    + "\nNota "  + (nroIdentificacao[2] + 1) + " = " + notasAluno[2]
						    + "\nMédia dos exercícios: " + df.format(mediaAproveitamento)
						    + "\nMédia de aproveitamento: " + df.format(mediaAproveitamento)
						    + "\nConceito: " + conceito
						    + "\nResultado: " + resultado);
		
		sc.close();

	}

}
