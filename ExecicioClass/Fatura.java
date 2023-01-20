package ExecicioClass;

public class Fatura {
    public int quantidade;
    public double preco;
    public int numero;
    public String descricao;


    public Fatura(int quantidade, double preco, int numero, String descricao) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.numero = numero;
        this.descricao = descricao;
    }

    public Fatura() {

    }

    public double getTotalFatura(){
        if (preco < 0 ){
            System.out.println("Seu saldo total e igual a 0");
        }
        if(quantidade<0){
            System.out.println("Sua quantidade atual e zero");
        }
        double fatura = preco * quantidade;
        return fatura;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
