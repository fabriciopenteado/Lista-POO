import java.util.*;

public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double media;

    public double calcularMedia(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;       
        
        media = (this.nota1 + this.nota2) / 2;
        return media;
    }

    public String verificarSituacao(String nome, double nota1, double nota2, double media) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
        
        if(media >= 7){
        return "\nAprovado";
        }else {
        return "\nReprovado";
        }
    }

    
   

    public void mostrarDados(String nome, double nota1, double nota2, double media) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;  
                
        System.out.println("\nAluno: " + this.nome);
        System.out.println("Nota 1: " + this.nota1);
        System.out.println("Nota 2: " + this.nota2);
        System.out.println("Media: " + this.media);

    }

}
