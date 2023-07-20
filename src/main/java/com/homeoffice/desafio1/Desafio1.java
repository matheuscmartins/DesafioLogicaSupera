package com.homeoffice.desafio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();
        List<Integer> par 	= new ArrayList<>();
        List<Integer> impar = new ArrayList<>();

        int n = 0;
        try {
            System.out.println("Digite a quatidade de numeros inteiros e positivo para a lista: ");
            n = sc.nextInt();
            if (n > 1) {
                int n2 = 0;
                for (int i = 0; i < n; i++) {
                    n2 = sc.nextInt();
                    if (n2 >= 0) {
                        lista.add(n2);
                    } else System.out.println("Numeros negativos não são armazenados!");
                }
                for (Integer x : lista) {
                    if (x % 2 == 0)
                        par.add(x);
                    else
                        impar.add(x);
                }

                Collections.sort(par);
                Collections.sort(impar);
                Collections.reverse(impar);

                for (Integer y : par)
                    System.out.println(y);
                for (Integer z : impar)
                    System.out.println(z);

            } else
                System.out.println("É permitidos somente numeros positivos!");
        } catch (RuntimeException e) {
            System.out.println("É permitidos somente numeros inteiros!");
        }
        sc.close();
    }
}