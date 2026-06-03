import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Aluno[] alunos = new Aluno[2];

        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = new Aluno();
            System.out.println("Favor, digitar seu nome: ");
            alunos[i].nome = leitor.nextLine();
            System.out.println("Digite a primeira nota");
            alunos[i].nota1 = leitor.nextDouble();
            leitor.nextLine();
            System.out.println("Digite a segunda nota");
            alunos[i].nota2 = leitor.nextDouble();
            leitor.nextLine();
            alunos[i].calcularMedia();
        }

        for (int i = 0; i < alunos.length; i++) {
            alunos[i].mostrarDados();
            System.out.println("");
        }

        // double calcularMedia = aluno.calcularMedia();
        // System.out.println("Sua media eh:" + calcularMedia);

    }

}