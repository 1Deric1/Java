package Senai_ex1;

public class Cachorro extends Animal{
    @Override
    public void som() {
        System.out.println("Au au!!");
    }

    @Override
    public void movimento() {
        System.out.println("Corre");
    }
}
