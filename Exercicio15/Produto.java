
public class Produto {
    String nome;
    double preco;
    int quantidade;

    void mastrarDados() {
        System.out.println("\nProduto: " + this.nome);
        System.out.println("Preco: " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
    }

}
