package beecroodExercicios_JAVA;

import java.util.Scanner;

public class Ex0025_CoordenadasUmPonto {
    public static void main(String[] args) {
        Scanner cd = new Scanner(System.in);

        double x, y;
        x = cd.nextDouble();
        y = cd.nextDouble();

        if ((x>0) && (y>0)) {
            System.out.println("Q1");
        } else if ((x<0) && (y>0)) {
            System.out.println("Q2");
        } else if ((x<0) && (y<0)) {
            System.out.println("Q3");
        } else if ((x>0) && (y<0)) {
            System.out.println("Q4");
        } else if ((x==0) && (y==0)) {
            System.out.println("Origem");
        } else if (x==0) {
            System.out.println("Eixo Y");
        } else if (y==0) {
            System.out.println("Eixo X");
        }

    }
}
