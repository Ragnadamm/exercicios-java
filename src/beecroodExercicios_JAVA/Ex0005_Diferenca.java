package beecroodExercicios_JAVA;

import java.util.Scanner;

public class Ex0005_Diferenca {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A, B, C, D, total;

        A = s.nextInt();
        B = s.nextInt();
        C = s.nextInt();
        D = s.nextInt();

        total = ((A * B) - (C * D));

        System.out.println("DIFERENCA = " + total);

    }
}
