package nelioAlves.vetores.exercicios.application;

import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        double soma = 0.0, media;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }
        media = soma / vect.length;
        System.out.println(" ");
        System.out.print("VALORES = ");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf(vect[i] + "  ");
        }
        System.out.printf("\nSOMA  = %.2f%n ", soma);
        System.out.printf("MEDIA  = %.2f%n ", media);

        sc.close();
    }
}
 