package Sobreescrita;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        //SuperClasse
        a.animal();
        //SubClasse com sobreescrita
        Esp e = new Esp();
        e.animal();
        //ip casting
        Animal a1 = new Esp();
        if (a1 instanceof Esp){

            System.out.println(a1.animal());
        }

    }
}
