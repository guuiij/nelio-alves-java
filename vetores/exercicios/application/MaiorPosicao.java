package nelioAlves.vetores.exercicios.application;

import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int quantidade = sc.nextInt();

        double[] vetor = new double[quantidade];

        double soma = vetor[0];
        int indice = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
            if (vetor[i] > soma) {
                soma = vetor[i];
                indice = i;
            }
        }
        System.out.println("MAIOR VALOR = " + soma );
        System.out.println("POSIÇÃO DO MAIOR VALOR = " + indice);


        sc.close();
    }
}
