package nelioAlves.heranca.application;

import nelioAlves.heranca.entities.Employee;
import nelioAlves.heranca.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int quantidade = sc.nextInt();


        List<Employee> employeeList = new ArrayList<>(quantidade);

        for (int i = 0; i < quantidade; i++) {

            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("(y/n)? ");
            String type = sc.next();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (type.equalsIgnoreCase("Y")) {
                System.out.print("Additional charge: ");
                double additional = sc.nextDouble();
                Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additional);
                employeeList.add(employee);

            } else {
                Employee employee = new Employee(name, hours, valuePerHour);
                employeeList.add(employee);
            }
        }
        System.out.println("PAYMENTS: ");
        System.out.println(employeeList);


        sc.close();
    }
}