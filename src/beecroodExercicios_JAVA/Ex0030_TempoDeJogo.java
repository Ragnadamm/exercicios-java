package beecroodExercicios_JAVA;

import java.util.Scanner;

public class Ex0030_TempoDeJogo {
    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);

        int horaInical = game.nextInt();
        int horaFinal = game.nextInt();

        if (horaInical > horaFinal) {
            System.out.println("O JOGO DUROU " + ((24 - horaInical) + horaFinal) + " HORA(S)");
        } else if (horaFinal > horaInical) {
            System.out.println("O JOGO DUROU " + (horaFinal - horaInical) + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }

    }
}
