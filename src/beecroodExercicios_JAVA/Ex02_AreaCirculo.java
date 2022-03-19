package beecroodExercicios_JAVA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex02_AreaCirculo {
    public static void main(String[] args) {
        Scanner circulo = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.0000");

        double n = 3.14159;
        double raio, area;

        raio = circulo.nextDouble();

        //Fómula  area = π . raio2.
        area = n * Math.pow(raio, 2);

        System.out.println("A=" + deci.format(area));

    }
}
