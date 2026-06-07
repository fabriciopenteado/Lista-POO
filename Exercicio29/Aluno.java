import java.util.*;

public class Aluno extends Pessoa {
    private double nota;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

     public void mostrarDados() {
       
        System.out.println("\nAluno: " + this.getNome());
        System.out.println("idade: " + this.getIdade());
        System.out.println("Nota: " + this.nota);
        
    }

}

