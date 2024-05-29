package nelioAlves.vetores.exercicios.application;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar ? ");
        int n = sc.nextInt();

        sc.nextLine();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }
       
        System.out.println("NÚMEROS NEGATIVOS");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }


        sc.close();
    }
}
