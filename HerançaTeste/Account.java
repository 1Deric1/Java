package HerançaTeste;

public class Account {
    private Integer number;
    private String holder;
    protected Double balance; //pode ser acessado pela subclasse pelo mesmo pacote e nao pode ser publico

    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }
    public void withdraw(Double amount){ //operacao de saque (removendo)
        balance -= amount;
    }
    public void deposit(Double amount){//Operacao de deposito (colocando)
        balance += amount;
    }

}
