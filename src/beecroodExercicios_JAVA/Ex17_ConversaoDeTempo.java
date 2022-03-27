package beecroodExercicios_JAVA;

import java.util.Scanner;

public class Ex17_ConversaoDeTempo {
    public static void main(String[] args) {
        Scanner conver = new Scanner(System.in);

        int tempo = conver.nextInt();

        int horas = tempo / 3600;
        int restoHora = tempo % 3600;

        int minutos = restoHora / 60;
        int restoMinutos = restoHora % 60;

        int segundos = restoMinutos;


        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);


    }
}
