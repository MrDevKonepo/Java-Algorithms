package exercicios;

//Um certo país A, possui 5.000.000 de habitantes e uma taxa denatalidadede 3% ao ano; um outro país,B, possui 7.000.000
// de habitantes e uma taxa de natalidadede 2% ao ano.Crie um
//programa em C quese ja capaz de calcular o mostraro tempo necessário para que a população do país A ultrapasse a população
// do país B. Conside requeestamos no ano 2000,mostre para cada ano qual a população de cada país,calcule para cada país,
// quanto a população representa em % em relação a população total de ambos países.

import java.text.NumberFormat;
import java.util.Locale;

public class TaxaNatalidade {

    public static void main(String[] args) {

        Locale ptBr = new Locale("pt", "BR"); //define a região
        NumberFormat moeda = NumberFormat.getNumberInstance();

        double populacaoA= 5.000000, populacaoB = 7.000000;
        double paisA = 0.03, paisB = 0.02;
        double porcA, porcB, total;
        System.out.println("ANO   A     %A     B     %B     TOTAL");

        for (int ano = 2000; populacaoA < populacaoB ; ano++ ) {

            populacaoA += paisA * populacaoA;
            populacaoB += paisB * populacaoB;

            total = populacaoA + populacaoB;

            porcA = (populacaoA * 100) / total;
            porcB = (populacaoB * 100) / total;

            System.out.println(ano + "  " + populacaoA + "  " + porcA + "  " + populacaoB + "  " + porcB + "  " + total);
        }

    }
}
