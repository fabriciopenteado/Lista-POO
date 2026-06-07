import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        System.out.println("Digite o nome do aluno");
        aluno.setNome(leitor.nextLine());
        System.out.println("Digite o valor do produto");
        aluno.setNota1(leitor.nextDouble());
        leitor.nextLine();
        System.out.println("Digite a quatidade");
        aluno.setNota2(leitor.nextInt());
        leitor.nextLine();


        System.out.println("\nAluno: " + aluno.getNome());
        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());
        System.out.println("Media: " + aluno.calcularMedia());
        System.out.println("Situacao: " + aluno.verificarSituacao());


    }

}