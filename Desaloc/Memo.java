package Desaloc;

public class Memo {
    public static void main(String[] args) {
    }
    public static void metodo(){
        MemC c = new MemC();
        System.out.println(c.name);
    }

    public static MemC metodo1(){
        MemC m = new MemC("Deric",500.00,15);
        return m;
    }

}
