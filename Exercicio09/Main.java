import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Aluno aluno = new Aluno();
        int quantidade = 0;
        double maior = 0;
        String nomeMaior = "";

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
            if (calcularMedia >= maior) {
                maior = calcularMedia;
                nomeMaior = aluno.nome;
            }
        }
        leitor.close();
        System.out.println("Aluno com a maior media: " + nomeMaior);
        System.out.println("Media maior: " + maior);
    }

}
