package Atividade;


import java.lang.invoke.StringConcatFactory;

public class Agenda {
    String nome;
    int idade;
    double altura;
    int qtd ;
    String[] n ;
    int c;
    int seach;
    Integer[] novoVetor;
    public Agenda() {

    }
    public Agenda(int qtd) {
        this.qtd = qtd;
        this.n = new String[qtd];
        this.c =0;
    }

    public String armazenaPessoa(String nome,int idade,double altura){

        String info = nome + ", " + idade + " anos, " + altura + "m";
        for (int i = 0; i < qtd; i++) {
            n[c] = info;
        }
        c++;
        return info;
    }

    public String mpessoa(int posicao) {
        String r = "";
        if (posicao >= 0 && posicao < n.length) {
            r = n[posicao];
        }
        return r;
    }
    public String rpessoa(int po) {
        if (po >= 0 && po < n.length) {
            String[] novoVetor = new String[n.length - 1];
            int j = 0;
            for (int i = 0; i < n.length; i++) {
                if (i != po) {
                    novoVetor[j] = n[i];
                    j++;
                }
            }
            n = novoVetor;
            c--;
            return "Pessoa removida com sucesso.\n";
        } else {
            return "Posição inválida.\n";
        }
    }

    public String toString() {
        String r = "";
        for (int i = 0; i <= 1; i++) {
            r += n[i]+ "\n";
        }
        return r;
    }
}
