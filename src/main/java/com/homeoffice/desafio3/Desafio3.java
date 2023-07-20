package com.homeoffice.desafio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, k, contador;
        try {
            System.out.println("Informe o tamanho do lista:");
            n = sc.nextInt();

            ArrayList<Integer> arr = new ArrayList<Integer>();
            System.out.println("Informe os numeros da lista:");

            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }

            System.out.println("Informe o numero a ser comparado: ");
            k = sc.nextInt();
            contador = 0;
            for(int x : arr){
                for(int y : arr){
                    if(x - y == k)
                        contador++;
                }
            }
            System.out.println();
            System.out.println("Os pares nos elementos do array que a diferença são igual ao valor alvo: " + contador);
        } catch (RuntimeException e) {
            System.out.println("É permitidos somente numeros inteiros!");
        }
        sc.close();
    }
}
