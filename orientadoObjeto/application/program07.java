package nelioAlves.orientadoObjeto.application;

import nelioAlves.orientadoObjeto.util.currencyConverter;

import java.util.Scanner;

public class program07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double price = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        double dolar = sc.nextDouble();

        System.out.print("Amount to be paid in reais = ");
        System.out.print(currencyConverter.cotacao(price, dolar));

        sc.close();
    }
}
