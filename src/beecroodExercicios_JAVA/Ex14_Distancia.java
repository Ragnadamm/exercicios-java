package beecroodExercicios_JAVA;

import java.util.Scanner;

public class Ex14_Distancia {
    public static void main(String[] args) {
        Scanner car = new Scanner(System.in);

        int km = car.nextInt();

        int tempo = km * 2;

        System.out.println(String.format("%d minutos", tempo));


    }
}
