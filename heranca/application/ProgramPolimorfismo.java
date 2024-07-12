package nelioAlves.heranca.application;

import nelioAlves.heranca.entities.Account;
import nelioAlves.heranca.entities.BusinessAccount;

public class ProgramPolimorfismo {
    public static void main(String[] args) {


        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new BusinessAccount(1023, "Maria", 1000.0, 0.01);

        x.withDraw(50);
        y.withDraw(50);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
