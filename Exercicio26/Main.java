import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Produto produto = new Produto();
        
        System.out.println("Digite o nome do produto");
        produto.setNome(leitor.nextLine());
        System.out.println("Digite o valor do produto");
        produto.setPreco(leitor.nextDouble());
        leitor.nextLine();
        System.out.println("Digite a quatidade");
        produto.setQuantidade(leitor.nextInt());
        leitor.nextLine();
        
        System.out.println("\nProduto: " + produto.getNome());
        System.out.println("Preco: " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
    
        leitor.close();
        
    }
    
}
