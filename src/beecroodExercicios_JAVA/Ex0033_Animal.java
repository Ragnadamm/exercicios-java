package beecroodExercicios_JAVA;

import java.util.Scanner;

public class Ex0033_Animal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tipo1 = sc.next();
        String tipo2 = sc.next();
        String tipo3 = sc.next();

        if (tipo1.equalsIgnoreCase("vertebrado")) {
			if (tipo2.equalsIgnoreCase("ave")) {
				if (tipo3.equalsIgnoreCase("carnivoro")) {
					System.out.println("aguia");
				} else {
					System.out.println("pomba");
				}
			} else {
				if (tipo3.equalsIgnoreCase("onivoro")) {
					System.out.println("homem");
				} else {
					System.out.println("vaca");
				}
			}
		} else {
			if (tipo2.equalsIgnoreCase("inseto")) {
				if (tipo3.equalsIgnoreCase("hematofago")) {
					System.out.println("pulga");
				} else {
					System.out.println("lagarta");
				}
			} else {
				if (tipo3.equalsIgnoreCase("hematofago")) {
					System.out.println("sanguessuga");
				} else {
					System.out.println("minhoca");
				}			
			}
		}

    }
}
