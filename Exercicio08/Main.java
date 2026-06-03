import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Aluno aluno = new Aluno();
        int quantidade = 0;
        int aprovados = 0;
        int reprovados = 0;

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
            if (calcularMedia >= 7) {
                aprovados++;
            } else {
                reprovados++;
            }
        }
        leitor.close();
        System.out.println("Quantidade de Aprovados foi: " + aprovados);
        System.out.println("Quantidade de Reprovados foi: " + reprovados);
    }

}
