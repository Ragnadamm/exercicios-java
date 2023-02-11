package beecroodExercicios_JAVA;

import java.util.Scanner;

public class Ex0038_NumerosPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 0;

        for (int i = 0; i < 6; i++) {
            double valor = sc.nextDouble();

            if (valor > 0) cont++;
            
        }
        
        System.out.println(cont + " valores positivos");

    }
}
