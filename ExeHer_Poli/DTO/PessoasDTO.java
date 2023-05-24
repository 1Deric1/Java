package ExeHer_Poli.DTO;

public class PessoasDTO {
    private String name;
    private String pass;

    public PessoasDTO(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null){
            System.out.println("Name nao pode ser null");
        }
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
