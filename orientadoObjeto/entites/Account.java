package nelioAlves.orientadoObjeto.entites;

public class Account {

    private int number; // numero da conta
    private String holder; // nome titular
    private double balance; // valor

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int account, String name, double initicalDeposit) {
        this.number = account;
        this.holder = name;
        depositar(initicalDeposit);
    }


    public int getNumber() {
        return this.number;
    }


    public String getHolder() {
        return this.holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return this.balance;
    }

    public void depositar(double value) {
        this.balance += value;
    }

    public void sacar(double value) {
        double fee = 5;
        if (this.balance < value) {
            System.out.println("Saldo em conta insuficiente.");
        } else {
            this.balance -= (value + fee);
            System.out.println("Saque de R$" + value + " realizado com sucesso.");
            System.out.println("Taxa de R$" + fee + " descontado por uso de saque.");
            System.out.println();
        }
    }

    public String toString() {
        return "Account "
                + this.number + "," +
                " " + "Holder: " +
                this.holder + ", " +
                "Balance: $ " + String.format("%.2f", this.balance);

    }


}
