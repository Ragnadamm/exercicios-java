package beecroodExercicios_JAVA;

import java.util.Scanner;

public class Ex0017_ConversaoDeTempo {
    public static void main(String[] args) {
        Scanner conver = new Scanner(System.in);

        int tempo = conver.nextInt();

        int horas = tempo / 3600;
        int restoHora = tempo % 3600;

        int minutos = restoHora / 60;
        int restoMinutos = restoHora % 60;

        int segundos = restoMinutos;


        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);

    }



/*
"%, d" significa que você está imprimindo 1 espaço, em seguida, um inteiro com vírgula(s) ([ 1,000,000,000])

            "%,d" significa que você está imprimindo um inteiro com vírgula(s) ([1,000,000,000])

            "%d" significa que você está imprimindo um inteiro sem vírgula(s) ([1000000000])



    Quando você corre seguindo linha

// extra space in front with number formatted
System.out.println(String.format("%, d",1000000000));

// number formatted with ,
System.out.println(String.format("%,d",1000000000));

// just number
System.out.println(String.format("%d",1000000000));

    OUTPUT:

            1,000,000,000

            1,000,000,000

            1000000000
            */


}
