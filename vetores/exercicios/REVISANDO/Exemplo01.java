package nelioAlves.vetores.exercicios.REVISANDO;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        // INSTANCIANDO VETOR TIPO PRIMITIVO
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] altura = new double[n];
        double media = 0.0;

        for (int i = 0; i < altura.length; i++) {
        altura[i] = sc.nextDouble();
        media += altura[i];
        }
        System.out.printf( "Total: %.2f%n", media);
        media = media/ altura.length;
        System.out.printf("AVERAGE HEIGHT = %.2f%n", media);


        sc.close();
    }

}
