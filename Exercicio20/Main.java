import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        double nota1;
        double nota2;
        double media;
        int quantidade = 0;
        String situacao;
     

        
        System.out.println("Qual a quantidade de alunos deseja cadastrar");
        quantidade = leitor.nextInt();
        leitor.nextLine();
        
        for (int i = 0; i < quantidade; i++) {
            
            Aluno aluno = new Aluno();
            
            System.out.println("Favor, digitar seu nome: ");
            nome = leitor.nextLine();
            System.out.println("Digite a primeira nota");
            nota1 = leitor.nextDouble();
            leitor.nextLine();
            System.out.println("Digite a segunda nota");
            nota2 = leitor.nextDouble();
            leitor.nextLine();
           
            
            aluno.calcularMedia(nome,nota1,nota2);
            aluno.mostrarDados(nome, nota1, nota2, aluno.calcularMedia(nome, nota1, nota2));
            System.out.println(aluno.verificarSituacao(nome, nota1, nota2, aluno.calcularMedia(nome, nota1, nota2)));
            
            

        }
        leitor.close();
       
    }

}
