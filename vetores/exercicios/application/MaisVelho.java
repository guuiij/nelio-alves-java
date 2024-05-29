package nelioAlves.vetores.exercicios.application;

import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();


        String[] nome = new String[n];
        int[] idade = new int[n];

        for (int i = 0; i < nome.length; i++) {
            sc.nextLine();
            System.out.println("Dado da " + (i + 1) + "ª pessoa:");
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();

        }

        int soma = 0;
        int maisVelho = 0;
        for (int i = 0; i < nome.length; i++) {
            if (idade[i] > soma) {
                soma = idade[i];
                maisVelho = i;
            }

        }
        System.out.println("PESSOA MAIS VELHA: " + nome[maisVelho]);

        sc.close();
    }
}
