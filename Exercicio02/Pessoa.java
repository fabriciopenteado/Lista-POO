public class Pessoa {

    String nome;
    int idade;

    void apresentar(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

}