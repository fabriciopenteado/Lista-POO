import java.util.*;

public class Professor extends Pessoa {
    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }

 public void mostrarDados() {
        System.out.println("\nProfessor: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Disciplina: " + this.disciplina);
       
    }


}

