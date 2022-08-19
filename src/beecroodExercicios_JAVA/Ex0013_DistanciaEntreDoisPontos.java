package beecroodExercicios_JAVA;

import java.util.Scanner;

public class Ex0013_DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        Scanner geo = new Scanner(System.in);

        double x1 = geo.nextDouble();
        double y1 = geo.nextDouble();
        double x2 = geo.nextDouble();
        double y2 = geo.nextDouble();

        double reta = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println(String.format("%.4f", reta)); //redudância dessa forma

        System.out.printf("%.4f%n", reta); //sem redundância


    }
}
