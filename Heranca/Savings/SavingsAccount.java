package Heranca.Savings;

import Heranca.Account.Account;

public final class SavingsAccount extends Account {
    //Final diz a classe nao pode ser herdada
    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    @Override//Sobreescrita
    public final void withdraw(Double amount) {
        balance -= amount;
    }
}
