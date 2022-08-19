package beecroodExercicios_JAVA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex0007_SalarioComBonus {
    public static void main(String[] args) {
        Scanner bonus = new Scanner(System.in);
        DecimalFormat bn = new DecimalFormat("0.00");

        String nome;
        double salarioFixo, totalVendaEfetuada;

        nome = bonus.next();
        salarioFixo = bonus.nextDouble();
        totalVendaEfetuada = bonus.nextDouble();

        System.out.println("TOTAL = R$ " + bn.format(salarioFixo + (totalVendaEfetuada * 0.15)));


    }
}
