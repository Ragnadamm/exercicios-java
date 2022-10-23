package beecroodExercicios_JAVA;

import java.util.Scanner;

//o código roda, mas não aprece como resposta certo no BEECROWD Q1047
public class Ex0031_TempoJogoMinutos___OBS {
    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);

        int horaInicial = game.nextInt();
        int minInicial = game.nextInt();
        int horaFinal = game.nextInt();
        int minFinal = game.nextInt();
        int horaTotal = horaFinal - horaInicial;
        int minTotal = minFinal - minInicial;

        if (horaTotal < 0) {
            horaTotal = 24 + (horaFinal - horaInicial);
        }

        if (minTotal < 0) {
            minTotal = 60 + (minFinal - minInicial);
            horaTotal--;
        }

        if ((horaInicial == horaFinal) && (minInicial == minFinal))
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        else System.out.println("O JOGO DUROU " + horaTotal + " HORA(S) E " + minTotal + " MINUTO(S)");

    }
}
