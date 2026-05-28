public class Aluno {
    String nome;
    double nota1;
    double nota2;

    double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }
}
