package nelioAlves.vetores.exercicios.application;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        double soma ;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();

        }
        int contador=0;

        System.out.println("NÚMEROS PARES: ");
        for (int i = 0; i < vect.length ; i++) {
            if (vect[i] % 2 == 0) {
                contador++;
                soma = vect[i];
                System.out.print(soma + "  ");
            }
        }
        System.out.println(" \n");
        System.out.print("QUANTIDADE DE PARES = " + contador);



        sc.close();
    }
}
