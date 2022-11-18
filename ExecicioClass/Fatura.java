package ExecicioClass;

public class Fatura {
    public int quantidade;
    public double preco;
    public String numero;
    public String descricao;

    public Fatura(int quantidade, double preco, String numero, String descricao) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.numero = numero;
        this.descricao = descricao;
    }

    public double getTotalFatura(){
        if (preco < 0 ){
            System.out.println("Seu saldo total e igual a 0");
        }
        double fatura = preco * quantidade;
        return preco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
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
