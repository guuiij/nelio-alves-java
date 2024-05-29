package nelioAlves.vetores.exercicios.application;

import nelioAlves.vetores.exercicios.entites.Pessoas;

import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos pessoas serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine(); // Quebra de linha após numero primitivo

        Pessoas[] pessoas = new Pessoas[n];


        String name;
        int age;
        double height, somaAltura = 0.0, mediaAltura;
        double contador = 0.0;
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Dados da " + (i + 1) + "º pessoa: ");

            System.out.print("Nome: ");
            name = sc.nextLine();

            System.out.print("Idade: ");
            age = sc.nextInt();
            sc.nextLine(); // Quebra de linha apos tipo primitivo

            System.out.print("Altura: ");
            height = sc.nextDouble();
            sc.nextLine(); // Quebra de linha apos tipo primitivo
            pessoas[i] = new Pessoas(name, age, height);  // Quem ta recebendo os dados

            somaAltura += pessoas[i].getHeight(); // somando altura e atribuindo em soma

            if (pessoas[i].getAge() < 16) { // condição para fazer contagem de quantidade menor de 16
                contador++;
            }
        }
        mediaAltura = (somaAltura / pessoas.length);
        double porcentagemMenor = contador / pessoas.length;

        System.out.println();
        System.out.printf("Altura média: %.2f%n ", mediaAltura);


        System.out.println("Pessoas com menos de 16 anos: " + porcentagemMenor*100 + "%");
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getAge() < 16) {
                System.out.println(pessoas[i].getName());
            }
        }

        sc.close();
    }
}
