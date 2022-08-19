package beecroodExercicios_JAVA;

import java.util.Scanner;

public class Ex0023_Lanche {
    public static void main(String[] args) {
        Scanner mc = new Scanner(System.in);

        int pedido, qtd;
        double preco, total;

        pedido = mc.nextInt();
        qtd = mc.nextInt();

        switch (pedido) {

            case 1:
                preco = 4;
                total = preco * qtd;
                System.out.print("Total: R$ ");
                System.out.printf("%.2f", total);
                System.out.print("\n");
                break;
            case 2:
                preco = 4.5;
                total = preco * qtd;
                System.out.print("Total: R$ ");
                System.out.printf("%.2f", total);
                System.out.print("\n");
                break;
            case 3:
                preco = 5;
                total = preco * qtd;
                System.out.print("Total: R$ ");
                System.out.printf("%.2f", total);
                System.out.print("\n");
                break;
            case 4:
                preco = 2;
                total = preco * qtd;
                System.out.print("Total: R$ ");
                System.out.printf("%.2f", total);
                System.out.print("\n");
                break;
            case 5:
                preco = 1.5;
                total = preco * qtd;
                System.out.print("Total: R$ ");
                System.out.printf("%.2f", total);
                System.out.print("\n");
                break;
            default:
                break;
        }

    }
}
