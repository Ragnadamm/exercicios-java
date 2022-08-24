package beecroodExercicios_JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0029_TiposDeTriangulos___VETOR {
    public static void main(String[] args) {
        Scanner geo = new Scanner(System.in);

        double[] lado = new double[3]; //vetor com capacidade/tamanho determinado por "[0]"
        double a, b, c;
        lado[0] = geo.nextDouble();
        lado[1] = geo.nextDouble();
        lado[2] = geo.nextDouble();

        Arrays.sort(lado);  //metodo para fazer o vetor colocar os números em ordem crescente

        //forma de fazer os números ficarem em ordem decrescente como pede a questão
        //Obs.: tem outras formas de se farzer isso com outros metodos por exemplo
        c = lado[0];
        b = lado[1];
        a = lado[2];

        if (a >= (b + c)) {
            System.out.print("NAO FORMA TRIANGULO\n");
        } else {
            if ((a * a) == ((b * b) + (c * c))) {
                System.out.print("TRIANGULO RETANGULO\n");
            }

            if ((a * a) > ((b * b) + (c * c))) {
                System.out.print("TRIANGULO OBTUSANGULO\n");
            }

            if ((a * a) < ((b * b) + (c * c))) {
                System.out.print("TRIANGULO ACUTANGULO\n");
            }

            if ((a == b) && (b == c)) {
                System.out.print("TRIANGULO EQUILATERO\n");
            }

            if (((a == b) && (b != c)) || ((a != b) && (b == c))) {
                System.out.print("TRIANGULO ISOSCELES\n");
            }
        }

    }
}
