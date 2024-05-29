package nelioAlves.lista.application;

import nelioAlves.lista.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        System.out.println();

        List<Employee> employees = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {

            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();


            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.println();

            Employee employee = new Employee(id, name, salary);

            employees.add(employee);


        } // Se digitar id de funcionárioo que não existe. --> This id does not exist !
        System.out.print("Enter the employee id that will have salary increse : ");
        int id = sc.nextInt();

        // Verifica se o ID fornecido pelo usuário corresponde a algum funcionário na lista
        boolean found = false;
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("This ID does not exist!");
        } else {
            System.out.print("Enter the percentage increase: ");
            double percentage = sc.nextDouble();

            // Aplica o aumento de salário ao funcionário correspondente
            for (Employee emp : employees) {
                if (emp.getId() == id) {
                    emp.increaseSalary(percentage);
                    break;
                }
            }

            // Exibe a lista de funcionários atualizada
            System.out.println("List of employees:");
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        }

        sc.close();
    }
}