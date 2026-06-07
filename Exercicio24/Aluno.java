import java.util.*;

public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double media;

    public Aluno (String nome){
        this.nome = nome;
        nota1 = 0;
        nota2 = 0;
    }
    
    public Aluno (String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    
    void alterarNotas(double nota1, double nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;
        
    }
    
    double calcularMedia() {
        media = (this.nota1 + this.nota2) / 2;
        return media;
    }

    public void mostrarDados() {
        System.out.println("Aluno: " + this.nome);
        System.out.println("Nota 1: " + this.nota1);
        System.out.println("Nota 2: " + this.nota2);
        System.out.println("Media: " + this.media);
    }
}    