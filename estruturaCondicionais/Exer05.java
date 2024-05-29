package nelioAlves.estruturaCondicionais;

// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
// seguir, calcule e mostre o valor da conta a pagar

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {

        System.out.println("     **** CARDAPIO ****");
        System.out.println("______________________________");
        System.out.println("CÓDIGO ESPECIFICAÇÃO    PREÇO ");
        System.out.println("______________________________");
        System.out.println("1      Cachorro Quente  R$4.00");
        System.out.println("2      X-Salada         R$4.50");
        System.out.println("3      X-Bacon          R$5.00");
        System.out.println("4      Torrada Simples  R$2.00");
        System.out.println("5      Refrigerante     R$1.50");
        System.out.println("______________________________");

        System.out.println("Digite o código e quantidade de produto");

        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        double quantidade = sc.nextInt();
        double valor;

        if (codigo == 1) {
            valor = quantidade * 4;
            System.out.println("Cachorro Quente");
            System.out.println("Quantidade " + quantidade + "\n Total: R$" + valor);

        } else if (codigo == 2) {
            valor = quantidade * 4.5;
            System.out.println("X-Salada");
            System.out.println("Quantidade " + quantidade + "\n Total: R$" + valor);

        } else if (codigo == 3) {
            valor = quantidade * 5;
            System.out.println("X-Bacon");
            System.out.println("Quantidade " + quantidade + "\n Total: R$" + valor);

        } else if (codigo == 4) {
            valor = quantidade * 2;
            System.out.println("Torrada Simples");
            System.out.println("Quantidade " + quantidade + "\n Total: R$" + valor);

        } else {
            valor = quantidade * 1.50;
            System.out.println("Refrigerante");
            System.out.println("Quantidade " + quantidade + "\n Total: R$" + valor);
        }

        sc.close();
    }
}
