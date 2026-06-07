import java.util.*;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
   
    public String getNome() {
        return nome;
    }
    public Double getNota1() {
        return nota1;
    }
    public Double getNota2() {
        return nota2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNota1(double nota1){
        if (nota1 >= 0 && nota1 <= 10){
            this.nota1 = nota1;
        }else {
            System.out.println("Nota invalida");
        }
    }
    public void setNota2(double nota2){
        if (nota2 >= 0 && nota2 <= 10){
            this.nota2 = nota2;
        }else {
            System.out.println("Nota invalida");
        }
    }

    double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    String verificarSituacao() {
        if (((this.nota1 + this.nota2) / 2) >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

}