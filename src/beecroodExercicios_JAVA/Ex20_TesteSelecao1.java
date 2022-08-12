package beecroodExercicios_JAVA;

import java.util.Scanner;

public class Ex20_TesteSelecao1 {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);

        int a, b, c, d;

        a = test.nextInt();
        b = test.nextInt();
        c = test.nextInt();
        d = test.nextInt();

        if (b > c && d > a && (c+d) > (a+b) && c > 0 && d > 0 && a%2 == 0)

        System.out.println("Valores aceitos");

        else
        System.out.println("Valores nao aceitos");


    }
}
