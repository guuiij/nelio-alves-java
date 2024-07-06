package nelioAlves.heranca.application;


import nelioAlves.heranca.entities.Account;
import nelioAlves.heranca.entities.BusinessAccount;
import nelioAlves.heranca.entities.SavingsAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING - Pega Objeto BusinessAccount(subclasse) e atribui para uma variável Account(superclasse);

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        // DOWNCASTING - Converter objeto da superclasse(Account) para subclasse(BusinessAccount)
        BusinessAccount acc4 = (BusinessAccount) acc2; // Casting Manual (tipoDaSubclasse)
        acc4.loan(100);

        //  BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount){// Verificando se a variável é uma instancia da Classe
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount){// Verificando se a variável é uma instancia da Classe
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.upDateBalance();
            System.out.println("Update!");

        }
        





        sc.close();
    }
}
