package beecroodExercicios_JAVA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex0027_Triangulo {
    public static void main(String[] args) {
        Scanner geo = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.0");

        double a, b, c, perimetro, area;
        a = geo.nextDouble();
        b = geo.nextDouble();
        c = geo.nextDouble();

        if (((a+b)>c) && ((a+c)>b) && ((b+c)>a)) {
            System.out.println("Perimetro = " + dc.format(perimetro = a + b +c));
        } else {
            System.out.println("Area = " + dc.format(area = ((a+b)*c)/2));
        }

    }
}
