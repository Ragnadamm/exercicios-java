package beecroodExercicios_JAVA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex0012_Consumo {
    public static void main(String[] args) {
        Scanner gasosa = new Scanner(System.in);
        DecimalFormat casa = new DecimalFormat("0.000");

        int X = gasosa.nextInt();
        double Y = gasosa.nextDouble();

        double gastoTotal = X/Y;

        System.out.println(casa.format(gastoTotal) + " km/l");

    }
}
