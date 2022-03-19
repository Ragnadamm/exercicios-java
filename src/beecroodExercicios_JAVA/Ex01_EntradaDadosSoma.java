package beecroodExercicios_JAVA;

import java.util.Scanner;

public class Ex01_EntradaDadosSoma {
    public static void main(String[] args) {
        Scanner soma = new Scanner(System.in);

        int A, B, X;

        A = soma.nextInt();
        B = soma.nextInt();

        X = A + B;

        System.out.println("SOMA = " + X);



    }
}
