package nelioAlves.heranca.entities;

public class BusinessAccount extends Account {
    private Double loanLimite;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimite) {
        super(number, holder, balance); // Chama o construtor da super classe Account
        this.loanLimite = loanLimite;
    }

    public Double getLoanLimite() {
        return loanLimite;
    }

    public void setLoanLimite(Double loanLimite) {
        this.loanLimite = loanLimite;
    }

    public void loan(double amount) {
        if ( amount <= loanLimite)
            balance += amount - 10;
    }
    @Override
    public void withDraw(double amount) {
      super.withDraw(amount);
      balance -= 2;

    }

}
