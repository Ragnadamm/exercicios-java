package beecroodExercicios_JAVA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex09_Esfera {
    public static void main(String[] args) {
        Scanner esfera = new Scanner(System.in);
        DecimalFormat saida = new DecimalFormat("0.000");

        double pi = 3.14159;
        double R = esfera.nextDouble();

        double vol = (4.0/3) * pi * Math.pow(R, 3);

        System.out.println("VOLUME = " + saida.format(vol));


    }
}
