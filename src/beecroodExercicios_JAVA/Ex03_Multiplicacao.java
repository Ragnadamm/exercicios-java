package beecroodExercicios_JAVA;

import java.util.Scanner;

public class Ex03_Multiplicacao {
    public static void main(String[] args) {
        Scanner multi = new Scanner(System.in);

        int C, D, multiplicacao;

        C = multi.nextInt();
        D = multi.nextInt();

        multiplicacao = C * D;

        System.out.println("PROD = " + multiplicacao);

    }
}
