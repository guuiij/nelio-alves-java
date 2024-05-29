package nelioAlves.estruturaCondicionais;

// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {

        System.out.println("Digite um numero para saber se é negativo ou não: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number >= 0) {
            System.out.println(" NÃO NEGATIVO ");
        } else {
            System.out.println(" NEGATIVO");
        }


        sc.close();

    }
}
