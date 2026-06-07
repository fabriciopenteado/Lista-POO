import java.util.*;

public class Main {

    public static void main(String[] args) {

        String nome;
        double preco;
        int quantidade;

        Scanner leitor = new Scanner(System.in);
        
            System.out.println("Digite o nome do produto");
            nome = leitor.nextLine();
            System.out.println("Digite o valor do produto");
            preco = leitor.nextDouble();
            leitor.nextLine();
            System.out.println("Digite a quatidade");
            quantidade = leitor.nextInt();
            leitor.nextLine();   
            Produto produto = new Produto(nome, preco, quantidade);
            
    }

}