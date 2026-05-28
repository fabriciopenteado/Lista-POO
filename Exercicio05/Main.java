import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Favor, digitar seu nome: ");
        aluno.nome = leitor.nextLine();
        System.out.println("Digite a primeira nota");
        aluno.nota1 = leitor.nextDouble();
        leitor.nextLine();
        System.out.println("Digite a segunda nota");
        aluno.nota2 = leitor.nextDouble();
        leitor.nextLine();

        double calcularMedia = aluno.calcularMedia();
        System.out.println("Sua media eh:" + calcularMedia);

    }

}