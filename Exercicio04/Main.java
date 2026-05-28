import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Digite o nome do produto");
        produto.nome = leitor.nextLine();
        System.out.println("Digite o valor do produto");
        produto.preco = leitor.nextDouble();
        leitor.nextLine();
        System.out.println("Digite a quatidade");
        produto.quantidade = leitor.nextInt();
        leitor.nextLine();
        leitor.close();

        produto.mastrarDados();

        double calcularValorTotal = produto.calcularValorTotal();
        System.out.println("O valor total do produto em estoque eh:" + calcularValorTotal);

    }

}