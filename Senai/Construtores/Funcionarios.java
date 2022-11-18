package Senai.Construtores;

public class Funcionarios {
    public String nome;
    public String scnome;
    public int horasTrabalhador;
    public Double vporhora;

    public Funcionarios(String nome, String scnome, int horasTrabalhador, Double vporhora) {
        this.nome = nome;
        this.scnome = scnome;
        this.horasTrabalhador = horasTrabalhador;
        this.vporhora = vporhora ;
    }

    public String nomeCompleto(){

        return nome
                +" "
                +scnome;
    }
    public Double Calcularsalario(){
        return vporhora*horasTrabalhador;
    }
    public void incrementarhora(int incrementarhoras){
        horasTrabalhador += incrementarhoras;
    }

}
