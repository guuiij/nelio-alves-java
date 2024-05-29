package nelioAlves.vetores.exercicios.application;

import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        double soma = 0, contador = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
            if (vect[i] % 2 == 0) {
                soma += vect[i];
                contador++;
            }
        }
        if (contador == 0){
            System.out.println("NENHUM NUMERO PAR");
        } else {
            soma = soma / contador;
            System.out.printf("MEDIA DOS PARES = %.1f%n", soma);
        }


        sc.close();
    }
}
