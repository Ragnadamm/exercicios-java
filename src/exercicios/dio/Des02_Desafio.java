package exercicios.dio;

/*Desafios
Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

Entrada
Você receberá 1 valor inteiro N, onde N > 0.

Saída
Exiba todos os números pares até o valor de entrada, sendo um em cada linha.*/

import java.util.Scanner;

public class Des02_Desafio {
    public static void main(String[] args) {
        Scanner div = new Scanner(System.in);

        String entrada;

        entrada = div.next();
        for (int i = 2; i <= Integer.parseInt(entrada); i++) {

            if (i % 2 == 0) {

                System.out.println(i);
            }
        }
    }
}

// LINK com a resposta
//https://github.com/lucasrmagalhaes/desafios-DIO/blob/master/Desafios/Java/3.%20Solu%C3%A7%C3%A3o%20de%20Problemas%20B%C3%A1sicos%20em%20Java/1.%20Exibindo%20N%C3%BAmeros%20Pares/solucao.java


// OBS =====================================================================================================

/*Integer =
The Integer class wraps a value of the primitive type int in an object. An object of type
Integer contains a single field whose type is int.
In addition, this class provides several methods for converting an int to a String and a String to an int,
as well as other constants and methods useful when dealing with an int.
----------------------------------------------------------------------------------------------------------
A classe Inteiro envolve um valor do tipo primitivo int em um objeto. Um objeto do tipo
Inteiro contém um único campo cujo tipo é int.
Além disso, esta classe fornece vários métodos para converter um int para uma String e uma String para
 um int, bem como outras constantes e métodos úteis ao lidar com um int.*/


/*parseInt =
Parses the string argument as a signed decimal integer. The characters in the
string must all be decimal digits, except that the first character may be an ASCII minus sign '-' ('\u002D') to
indicate a negative value or an ASCII plus sign '+' ('\u002B') to indicate a positive value. The resulting
integer value is returned, exactly as if the argument and the radix 10
were given as arguments to the parseInt(String, int) method.
-------------------------------------------------------------------------------------------------------
Analisa o argumento das cordas como um inteiro decimal assinado. Os caracteres na string devem
ser todos dígitos decimais, exceto que o primeiro caractere pode ser um ASCII menos sinal '-' ('-') para
indicar um valor negativo ou um ASCII mais sinal '+' ('+') para indicar um valor positivo. O valor inteiro
resultante é devolvido, exatamente como se o argumento e o radix 10
fossem dados como argumentos para o método parseInt (String, int).*/

