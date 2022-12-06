package Heranca;

public class Gerente extends Func1 {
    public String user_bd;
    public String senha_bd;
    public String senha;
    public String user;

    public Gerente(String nome, Integer cpf, Character sexo, Integer idade) {
        super(nome, cpf, sexo, idade);
    }

    public void autenticar(){
        if (user.equals(user_bd) && senha.equals(senha)){
            System.out.println("Voce é um Gerente");
        }

        else{
            System.out.println("Senha ou Usuario incorreto");
        }

    }
}
