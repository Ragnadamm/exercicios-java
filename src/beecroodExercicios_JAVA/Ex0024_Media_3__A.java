package beecroodExercicios_JAVA;

import java.util.Scanner;

//Mesmo o código rodando, resposta não foi aceita no BEECROWD

public class Ex0024_Media_3__A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n1, n2, n3, n4, media, notaExame, mediaFinal;

        n1 = scan.nextDouble();
        n2 = scan.nextDouble();
        n3 = scan.nextDouble();
        n4 = scan.nextDouble();

        media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / (2 + 3 + 4 + 1);

        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.println("Aluno reprovado.");
        } else if ((media < 7) && (media >= 5)) {
            System.out.println("Aluno em exame.");
            notaExame = scan.nextDouble();
            System.out.println("Nota do exame: " + notaExame);

            mediaFinal = (media + notaExame) / 2;

            if (mediaFinal >= 5) {
                System.out.println("Aluno aprovado.");
            } else if (mediaFinal < 5) {
                System.out.println("Aluno reprovado.");
            }

            System.out.println("Média final: " + mediaFinal);
        }

    }
}
