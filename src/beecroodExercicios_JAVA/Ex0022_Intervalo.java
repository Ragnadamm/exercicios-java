package beecroodExercicios_JAVA;

import java.util.Scanner;

public class Ex0022_Intervalo {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        double inter;

        inter = valor.nextDouble();

        if ((inter >= 0) && (inter <= 25)) {
            System.out.println("Intervalo [0,25]");
        } else if ((inter > 25) && (inter <= 50)) {
            System.out.println("Intervalo (25,50]");
        } else if ((inter > 50) && (inter <= 75)) {
            System.out.println("Intervalo (50,75]");
        } else if ((inter > 75) && (inter <= 100)) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora do intervalo");
        }



//        ** Resposta aceita no beecrowd

//        Scanner scan = new Scanner(System.in);
//        double num;
//        num = scan.nextDouble();
//        if((num>=0) && (num<=25)){
//            System.out.print("Intervalo [0,25]\n");
//        }else if((num>25) && (num<=50)){
//            System.out.print("Intervalo (25,50]\n");
//        }else if((num>50) && (num<=75)){
//            System.out.print("Intervalo (50,75]\n");
//        }else if((num>75) && (num<=100)){
//            System.out.print("Intervalo (75,100]\n");
//        }else{
//            System.out.print("Fora de intervalo\n");
//        }

//        NÃO SE PODE USAR DOUBLE EM UM "SWITCH CASE
//        "
//        switch (inter) {
//
//            case ((inter >= 0) && (inter <= 25)):
//                System.out.println("Intervalo [0,25]");
//                break;
//            case ((inter > 25) && (inter <= 50)):
//                System.out.println("Intervalo (25,50]");
//                break;
//            case ((inter > 50) && (inter <= 75)):
//                System.out.println("Intervalo (50,75]");
//                break;
//            case ((inter > 75) && (inter <= 100)):
//                System.out.println("Intervalo (75,100]");
//                break;
//        }
    }
}
