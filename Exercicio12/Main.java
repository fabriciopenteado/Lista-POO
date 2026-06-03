import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Produto produto = new Produto();
        int quantidade = 0;
        double maior = 0;
        String prodCaro = "";

        System.out.println("Qual a quantidade de produtos deseja cadastrar");
        quantidade = leitor.nextInt();
        leitor.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome do produto");
            produto.nome = leitor.nextLine();
            System.out.println("Digite o valor do produto");
            produto.preco = leitor.nextDouble();
            leitor.nextLine();
            System.out.println("Digite a quatidade");
            produto.quantidade = leitor.nextInt();
            leitor.nextLine();

            if (produto.preco >= maior) {
                maior = produto.preco;
                prodCaro = produto.nome;
            }

        }

        leitor.close();

        // produto.mastrarDados();

        System.out.println("O produto mais caro eh:" + prodCaro);
        System.out.printf("No valor R$ %.2f  ", maior);

    }

}