package nelioAlves.orientadoObjeto.application;

import nelioAlves.orientadoObjeto.entites.Student;

import java.util.Scanner;

public class Program05 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Name: ");
        student.name = sc.nextLine();

        student.firstGrade = sc.nextDouble();
        student.secondGrade = sc.nextDouble();
        student.thirdGrade = sc.nextDouble();

        //System.out.printf("FINAL GRADE");
        System.out.println(student);


        sc.close();

    }


}
