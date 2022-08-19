package beecroodExercicios_JAVA;

import java.util.Scanner;

public class Ex0016_Cedulas {
    public static void main(String[] args) {
        Scanner contar = new Scanner(System.in);

        int notasInseridas = contar.nextInt();

        int atual = notasInseridas;

        int notas100 = atual/100;
        atual -= notas100 * 100;
        int notas50 = atual/50;
        atual -= notas50 * 50;
        int notas20 = atual/20;
        atual -= notas20 * 20;
        int notas10 = atual/10;
        atual -= notas10 * 10;
        int notas5 = atual/5;
        atual -= notas5 * 5;
        int  notas2 = atual/2;
        atual -= notas2 * 2;
        int notas1 = atual;

        System.out.println(notasInseridas);
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");


       /* outro modo de fazer

       Scanner grana = new Scanner(System.in);
        int V, cash, n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 1;
        V = grana.nextInt();

        cash = V;
        n100 = V / 100;
        V %= 100;
        n50 = V / 50;
        V %= 50;
        n20 = V / 20;
        V %= 20;
        n10 = V / 10;
        V %= 10;
        n5 = V / 5;
        V %= 5;
        n2 = V / 2;
        V %= 2;
        n1 = V;

        System.out.println(cash);
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");

       */




    }
}
