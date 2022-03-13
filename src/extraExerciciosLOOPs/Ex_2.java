package extraExerciciosLOOPs;

import java.util.Scanner;

/*Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
  mostrando uma mensagem de erro e voltando a pedir as informações.*/
public class Ex_2 {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);

        String user;
        String password;

        System.out.println("Digite o login: ");
        user = login.next();
        System.out.println("Digite a senha: ");
        password = login.next();

        while ( user == password) {
            System.out.print("ERRO!, usuário e senha não podem ser iguais, digite uma nova senha: ");
            System.out.println("Digite a senha: ");
            password = login.next();
        }

        System.out.println("Cadastro aprovado!");

    }
}
