package MyForm.DTO;

import javax.swing.*;

public class FuncionariosDTO {
    private String nome;
    private String senha;


    public FuncionariosDTO() {

    }

    public FuncionariosDTO(String nome) {
        this.nome = nome;
    }

    public FuncionariosDTO(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha == null || senha.isEmpty()) {
            throw new IllegalArgumentException("Senha não pode ser nula ou vazia");
        }
        this.senha = senha;
    }
    /*
    @Override
    public String toString() {
        return "FuncionariosDTO{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
     */
}
