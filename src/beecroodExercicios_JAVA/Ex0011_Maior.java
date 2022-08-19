package beecroodExercicios_JAVA;

import java.util.Scanner;

/*Faça um programa que leia três valores e apresente o maior dos três valores
 lidos seguido da mensagem “eh o maior”. Utilize a fórmula:

 MaiorAB = (a + B + abs(a - b))/2

Obs.: a fórmula apenas calcula o maior entre os dois primeiros
(a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
 */
public class Ex0011_Maior {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        int a = valor.nextInt();
        int b = valor.nextInt();
        int c = valor.nextInt();

        int MaiorAB = (a + b + Math.abs(a - b))/2;

        int MaiorAC = (MaiorAB + c + Math.abs(MaiorAB - c))/2;

        System.out.println(MaiorAC + " eh o maior");


    }
}
