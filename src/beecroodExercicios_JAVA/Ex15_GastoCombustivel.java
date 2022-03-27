package beecroodExercicios_JAVA;

import java.util.Scanner;

public class Ex15_GastoCombustivel {
    public static void main(String[] args) {
        Scanner gasosa = new Scanner(System.in);

        int horas = gasosa.nextInt();
        int velMedia = gasosa.nextInt();

        double distancia = horas * velMedia;
        double litrosGasto = (distancia)/12;

        System.out.printf("%.3f\n", litrosGasto);




    }
}
