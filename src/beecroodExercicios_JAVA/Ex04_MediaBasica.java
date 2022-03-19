package beecroodExercicios_JAVA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04_MediaBasica {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.0");

        double a, b, c, media;

        a = m.nextDouble();
        b = m.nextDouble();
        c = m.nextDouble();

        //média ponderada é devidida pelo somatório dos pesos
        media = ((a * 2) + (b * 3) + (c * 5))/10;

        System.out.println("MEDIA = " + d.format(media));

    }
}
