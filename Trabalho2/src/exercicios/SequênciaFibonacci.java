package exercicios;

import java.util.Scanner;
import java.util.logging.Logger;

public class SequênciaFibonacci {

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para ver sua sequência de fibonacci: ");
        n = sc.nextInt();

        if (n == 0 || n == 1 || n == 2) {
            System.out.println("A sequência se inicia em 2");
        }

        Integer[] seq = new Integer[n];

        seq[0] = 0;
        seq[1] = 1;
        for (int i = 2; i < n; i++) {
            seq[i] = seq[i - 1] + seq[i - 2];
        }

         for (int i = 0; i < n; i++) {
             System.out.print(seq[i] + " ");
         }
         
         sc.close();
    }
}
