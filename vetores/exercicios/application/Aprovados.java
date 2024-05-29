package nelioAlves.vetores.exercicios.application;

import nelioAlves.vetores.exercicios.entites.Alunos;

import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();

        Alunos[] aluno = new Alunos[n];



        for (int i = 0; i < aluno.length; i++) {
            sc.nextLine();
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "º aluno:");
            String nome = sc.nextLine();
            double nota01 = sc.nextDouble();
            double nota02 = sc.nextDouble();

            aluno[i] = new Alunos(nome, nota01, nota02);
        }

        System.out.println("Aunos aprovados:");
        for (int i = 0; i < aluno.length; i++) {

            if (aluno[i].calcularMedia() >= 6) {

                System.out.println(aluno[i].getName());


            }


        }
        sc.close();
    }
}
