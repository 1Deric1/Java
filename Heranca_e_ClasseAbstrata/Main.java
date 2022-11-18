package Heranca_e_ClasseAbstrata;

import java.util.Locale;

public class Main{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        //Classe é uma classe herdada da classe abstrata
        Classe animal = new Classe();
        //Classe1 é uma classe herdada da classe abstrata
        Classe1 carros = new Classe1();
        //Obs: é que as classes abstratas nao podem ser instanciadas como objetos
        carros.marcas();
        animal.animal();
    }
}
