package nelioAlves.orientadoObjeto.application;

import nelioAlves.orientadoObjeto.entites.Account;

import java.util.Scanner;

public class Program08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        Account account;

        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if (response == 'Y' || response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double inicialDeposit = sc.nextDouble();
            account = new Account(number, holder, inicialDeposit);
        } else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.depositar(depositValue);
        System.out.println("Updated Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.sacar(withdrawValue);
        System.out.println("Updated Account data: ");
        System.out.println(account);


        sc.close();
    }
}
