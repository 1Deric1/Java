package Casting;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cachorro c = new Cachorro();
        Gato g = new Gato();
        Animal ac = c;
        fazerSom(c);
        fazerSom(g);

    }
    public static void fazerSom(Animal animal) {
        animal.Sons();
    }
}
