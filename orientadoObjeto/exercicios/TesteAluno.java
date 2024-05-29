package nelioAlves.orientadoObjeto.exercicios;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite nome, idade e curso");
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        String course = sc.nextLine();

        Aluno aluno = new Aluno(name, age, course);

        System.out.println();
        aluno.infoAluno();
        aluno.statusIdade();
        if (aluno.statusIdade()){
            System.out.println("Aluno maior de idade");
        }else {
            System.out.println("Aluno menor de idade");
        }



        sc.close();
    }
}
