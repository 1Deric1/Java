package NewSeachBd.DTO;

public class FuncioDTO {
    private String name;
    private String pass;

    public FuncioDTO() {
    }

    public FuncioDTO(String name) {
        this.name = name;
    }

    public FuncioDTO(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        if(nome == null){
            System.out.println("nome nao pode ser nullo");
        }
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        if(pass == null){
            System.out.println("pass nao pode ser nulla");
        }
        this.pass = pass;
    }
}
