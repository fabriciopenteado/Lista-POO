import java.util.*;

public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double media;

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
