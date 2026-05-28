public class Produto {
    String nome;
    double preco;
    int quantidade;

    public void mostrarDados() {
        System.out.println("Produto: " + this.nome);
        System.out.println("Preco: " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);

    }
}
