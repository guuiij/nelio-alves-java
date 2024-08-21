package nelioAlves.heranca.application;

import nelioAlves.heranca.entities.Contribuinte;
import nelioAlves.heranca.entities.PessoaFisica;
import nelioAlves.heranca.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramContribuinte {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contribuinte> contribuinteList = new ArrayList<>();
        double total = 0;


        System.out.print("Enter the number of the tax payers: ");
        int count = sc.nextInt();


        for (int i = 0; i < count; i++) {

            Contribuinte contribuinte;

            System.out.println("Tax payer #"+(i+1)+" data: ");
            System.out.print("Fisica or Juridica (F/J)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double rendaAnual = sc.nextDouble();
            if (type == 'f') {
                System.out.print("Health expenditures: ");
                double gastoSaude = sc.nextDouble();

                contribuinte = new PessoaFisica(name, rendaAnual, gastoSaude);

            } else {
                System.out.print("Number of employees: ");
                int employee = sc.nextInt();

                contribuinte = new PessoaJuridica(name, rendaAnual, employee);
            }
            contribuinteList.add(contribuinte);
        }
        System.out.println();
        System.out.println("TAXES PAID: ");
        for (Contribuinte c : contribuinteList) {
            System.out.println( c.getName() +": $ "+ String.format("%.2f ", c.valorImposto()));
        }
        for (Contribuinte c : contribuinteList) {
            total += c.valorImposto();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $"+ String.format("%.2f ",total));


        sc.close();
    }
}
