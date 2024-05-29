package nelioAlves.estruturaCondicionais;

// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {

        System.out.println("Par ou ímpar ? ");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }


    }
}
