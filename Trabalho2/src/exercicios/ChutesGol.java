package exercicios;
//Crie um programa o qual deverá obter a discrepância ea variânci a de uma amostra relativa aos chutes livres ao gol
//convertido sem acertos; tais chutes são realizados por jogadores de futebol.
//Como iniciativa organizeos dados em vetores de acordo com as colunas da tabela abaixo:

//As discrepâncias são calculadas por :𝑥𝑖=𝑋𝑖−𝑀 Onde,Xi é a quantidade de acertos de cada jogadore M,
//a média aritmética da soma dos acertos. A variância S é dada pela somatória de xi ao quadrado.

public class ChutesGol {

    public static void main(String[] args) {

        Integer[] gols = {8,4,6,10,9,7,8,12,5,8,3};
        Integer[] discrepancia = new Integer[11];
        Integer[] variancia = new Integer[11];
        Integer media = 0;
        media = calcmedia(gols, media);

        System.out.println("Calc Dos valores");

        for (int i = 0; i < 11; i ++) {

            for (int j = 0; j < 11; j++) {
                discrepancia[i] = gols[i] - media;
                variancia[i] = (discrepancia[i] * discrepancia[i]);

            }

            System.out.println("Jogador  " + "   Acertos(Xi)  " + "  xi  " + "xi*2");
            System.out.println( i + "             " + gols[i] + "            " + discrepancia[i] + "    " + variancia[i]);
        }
    }

    private static Integer calcmedia(Integer[] gols, Integer media) {
        for (int i = 0; i < 11; i ++) {
            media += gols[i];
        }
        return media/11;
    }

}
