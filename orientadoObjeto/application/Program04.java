package nelioAlves.orientadoObjeto.application;

import nelioAlves.orientadoObjeto.entites.Employee;

import java.util.Scanner;

public class Program04 {
    public static void main(String[] args) {

        Employee em = new Employee();
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        em.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        em.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        em.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + em);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        em.increseSalary(sc.nextDouble());

        System.out.println();
        System.out.println("Update data: " + em);

        sc.close();
    }
}
