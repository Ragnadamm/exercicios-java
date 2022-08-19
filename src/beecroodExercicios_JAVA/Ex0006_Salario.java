package beecroodExercicios_JAVA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex0006_Salario {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");

        int funcionario, horasTrab;
        double valorHora, salario;

        funcionario = calc.nextInt();
        horasTrab = calc.nextInt();
        valorHora = calc.nextDouble();

        salario = horasTrab * valorHora;


        System.out.println("NUMBER = " + funcionario);
        System.out.println("SALARY = U$ " + d.format(salario));


    }
}
