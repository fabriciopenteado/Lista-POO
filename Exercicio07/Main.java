import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Aluno aluno = new Aluno();
        int quantidade = 0;

        System.out.println("Qual a quantidade de alunos deseja cadastrar");
        quantidade = leitor.nextInt();
        leitor.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Favor, digitar seu nome: ");
            aluno.nome = leitor.nextLine();
            System.out.println("Digite a primeira nota");
            aluno.nota1 = leitor.nextDouble();
            leitor.nextLine();
            System.out.println("Digite a segunda nota");
            aluno.nota2 = leitor.nextDouble();
            leitor.nextLine();

            double calcularMedia = aluno.calcularMedia();
            System.out.println("\nSua media eh:" + calcularMedia);
            String verificarSituacao = aluno.verificarSituacao();
            System.out.println("Voce foi : " + verificarSituacao + "\n");

        }
        leitor.close();
    }

}
