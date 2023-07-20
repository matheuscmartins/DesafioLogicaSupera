package com.homeoffice.desafio4;

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        System.out.println("Informe o Nº de linhas:");
        int n = sc.nextInt();
            System.out.println("Informe linha por linha do texto:");
        for (int i = 0; i < n; i++) {
            String frase = readLine(sc);
            StringBuilder parte1 = new StringBuilder(frase.substring(0, frase.length() / 2));
            StringBuilder parte2 = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));
            parte1.reverse();
            parte2.reverse();
            System.out.println(parte1.toString() + parte2.toString());
            System.out.println();
        }
    } catch (RuntimeException e) {
        System.out.println("É permitidos somente numeros inteiros!");
    }
        sc.close();
    }

    public static String readLine(Scanner leitor) {
        String linha = leitor.nextLine();
        while (linha.isEmpty())
            linha = leitor.nextLine();
        return linha;
    }
}