package HerançaTeste;

public class SavingsAccount extends Account{
    private Double interestRate;
    public SavingsAccount() {
        super();
    }
    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);//super e pra poder pegar atributos da classe Mae
        this.interestRate = interestRate;
    }
    public Double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
    public void upadteBalance(Double amount){
        balance += balance * interestRate; // responsavel por atualizar o saldo da conta
    }

    @Override
    public void withdraw(Double amount) {
        balance-=amount;
    }
}
