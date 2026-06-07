import java.util.*;

public class Funcionario {
    private String nome;
    private double salario;


    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario=salario;
    }

    public String toString() {
        return "Funcionário: " + this.nome + " | Salário: R$ " + this.salario;
    }


    public double calcularSalarioFinal(){
        return salario;
    }


    public void cadastrarFuncionario(){
    
    }


}

