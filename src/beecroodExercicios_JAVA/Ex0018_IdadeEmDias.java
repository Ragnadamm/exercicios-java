package beecroodExercicios_JAVA;

import java.util.Scanner;

public class Ex0018_IdadeEmDias {
    public static void main(String[] args) {
        Scanner vida = new Scanner(System.in);

        int idade, anos, meses, dias;

        idade = vida.nextInt();

        anos = idade / 365;

        meses = (idade % 365)/ 30;

        dias = (idade % 365)% 30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");


    }
}
