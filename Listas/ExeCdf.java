package Listas;

import javax.naming.Name;

public class ExeCdf {

    private Integer id;
    private String Name;
    private Double salary;

    public ExeCdf() {

    }

    public ExeCdf(Integer id, String name, Double salary) {
        this.id = id;
        Name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double porcentage){
        salary += salary * porcentage /100;
    }

}
