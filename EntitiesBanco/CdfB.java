package EntitiesBanco;

public class CdfB {
    private int number;
    private String holder;
    private double balance;
    
    public CdfB(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public CdfB(int number, String holder, double inicialDeposit) {
        this.number = number;
        this.holder = holder;
        //Vai ter apenas um ponto de alterção e nao vai precisar mudar no construtor
        Deposit(inicialDeposit);
    }

    public int getNumber() {
        return number;
    }   
    
    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }
    
    public Double getBalance() {
        return balance;
    }

    public void Deposit(double amount){
        balance += amount;
    }
    
    public void withdraw(double amount){
        balance -= amount +5.0;
    }

    @Override
    public String toString() {
        return "Account: " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
    }
}
