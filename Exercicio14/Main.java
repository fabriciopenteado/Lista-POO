import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Aluno[] alunos = new Aluno[5];
        String busca = "";
        boolean encocntrado = false;

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

        System.out.println("\nDigite o nome do aluno que deseja localizar:");
        busca = leitor.nextLine();
        leitor.close();

        for (int i = 0; i < alunos.length; i++) {
            if(alunos[i].nome.equals(busca)){
                alunos[i].mostrarDados();
                encocntrado = true;
            }
        }
        if(!encocntrado){
            System.out.println("Aluno nao encontrado");
        }    
    }

}