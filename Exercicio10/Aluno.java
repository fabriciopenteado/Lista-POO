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

    String verificarSituacao() {
        if (media >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }

    }

}
