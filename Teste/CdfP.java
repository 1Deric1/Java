package Teste;

public class CdfP {
    private  Double salario;
    public String name;

    public CdfP(Double salario, String name) {

        this.salario = salario;
        this.name = name;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}