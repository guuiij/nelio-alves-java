package nelioAlves.vetores.exercicios.desafio;

import nelioAlves.vetores.exercicios.entites.Quarto;

/*  A dona de um pensionato possui dez quartos para alugar para estudantes,
    sendo esses quartos identificados pelos números 0 a 9.
    Fazer um programa que inicie com todos os dez quartos vazios, e depois
    leia uma quantidade N representando o número de estudantes que vão
    alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
    N estudantes. Para cada registro de aluguel, informar o nome e email do
    estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
    que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
    um relatório de todas ocupações do pensionato, por ordem de quarto,
    conforme exemplo.*/

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Quarto[] quartos = new Quarto[10];


        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();

        quartos[9] = new Quarto("Carlos", "breakcarlos@yahoo.com");// Testando pra ve se mostra quarto ocupado

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println();
            System.out.println("Rent #" + (i + 1) + ": ");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int posicao = sc.nextInt();

            if (posicao >= 0 && posicao < 10) {
                if (quartos[posicao] == null) {
                    quartos[posicao] = new Quarto(name, email);
                } else {
                    System.out.println("Quarto ja esta ocupado");
                }
            } else {
                System.out.println("Valor digitado inválido.");
            }
        }
        System.out.println();
        System.out.println("Busy Rooms: ");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i]); // usado toString na classe, para poder usar aqui e nao mostrar referencia
            }

        }


        sc.close();
    }
}
