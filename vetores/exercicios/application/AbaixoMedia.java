package nelioAlves.vetores.exercicios.application;

import java.util.Scanner;

public class AbaixoMedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos terá o vetor? ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        double media = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
            media += vect[i];
        }
        System.out.println("\n");
        media = media / vect.length;

        System.out.println("MEDIA DO VETOR = " + media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < media) {
                media = vect[i];
                System.out.println(media);
            }
        }

        sc.close();
    }

}
