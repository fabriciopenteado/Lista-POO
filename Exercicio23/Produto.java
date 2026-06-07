
public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    void mastrarDados() {
        System.out.println("\nProduto: " + this.nome);
        System.out.println("Preco: " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
    }
}
