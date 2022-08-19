package beecroodExercicios_JAVA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex0010_Area {
    public static void main(String[] args) {
        Scanner areas = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.000");

        double A = areas.nextDouble();
        double B = areas.nextDouble();
        double C = areas.nextDouble();

        double pi = 3.14159;

        System.out.println("TRIANGULO: " + deci.format((A * C)/2));
        System.out.println("CIRCULO: " + deci.format((pi * Math.pow(C, 2))));
        System.out.println("TRAPEZIO: " + deci.format(((A + B) * C)/2));
        System.out.println("QUADRADO: " + deci.format(Math.pow(B, 2)));
        System.out.println("RETANGULO: " + deci.format(A * B));


    }
}
