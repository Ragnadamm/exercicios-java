package beecroodExercicios_JAVA;

import java.util.Scanner;

public class Ex0028_Multiplos {
    public static void main(String[] args) {
        Scanner multi = new Scanner(System.in);

        int x = multi.nextInt();
        int y = multi.nextInt();

        if ((x % y == 0) || (y % x == 0)) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

    }
}
