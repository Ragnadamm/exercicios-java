package beecroodExercicios_JAVA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex0008_CalculoSimples {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        DecimalFormat valor = new DecimalFormat("0.00");

        /*Digita os valores na mesma linha normalmente, que os inputs são
        lidos na mesma linha, desde que separe eles com espaço (5 1 4,30).*/

        int codigoPeca_1 = calc.nextInt();
        int qtdPecas_1 = calc.nextInt();
        double valorUniPeca_1 = calc.nextDouble();
        int codigoPeca_2 = calc.nextInt();
        int qtdPecas_2 = calc.nextInt();
        double valorUniPeca_2 = calc.nextDouble();

        double total = (qtdPecas_1 * valorUniPeca_1) + (qtdPecas_2 * valorUniPeca_2);

        System.out.println("VALOR A PAGAR: R$ " + valor.format(total));


    }
}
