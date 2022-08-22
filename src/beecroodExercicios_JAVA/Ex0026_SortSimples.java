package beecroodExercicios_JAVA;

import java.util.Scanner;

public class Ex0026_SortSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if ((a>=b) && (b>=c)) {
            System.out.print(c + "\n" + b + "\n" + a + "\n\n" + a + "\n" + b + "\n" + c + "\n");
        } else if ((a<=b) && (b<=c)) {
            System.out.print(a + "\n" + b + "\n" + c + "\n\n" + a + "\n" + b + "\n" + c + "\n");
        } else if ((a>=c) && (c>=b)) {
            System.out.print(b + "\n" + c + "\n" + a + "\n\n" + a + "\n" + b + "\n" + c + "\n");
        } else if ((a<=c) && (c<=b)) {
            System.out.print(a + "\n" + c + "\n" + b + "\n\n" + a + "\n" + b + "\n" + c + "\n");
        } else if ((c<=a) && (a<=b)) {
            System.out.print(c + "\n" + a + "\n" + b + "\n\n" + a + "\n" + b + "\n" + c + "\n");
        } else if ((b<=a) && (a<=c)) {
            System.out.print(b + "\n" + a + "\n" + c + "\n\n" + a + "\n" + b + "\n" + c + "\n");
        }

    }
}
