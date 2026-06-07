
public class Carro {

    String modelo;
    int velocidadeAtual;
    int velocidadeMaxima;


    public int acelerar(int velocidadeAtual, int velocidadeMaxima){

        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMaxima = velocidadeMaxima;
        if(this.velocidadeAtual < this.velocidadeMaxima){
            velocidadeAtual += 10;
        }else{
            System.out.println("Voce ja esta no limite de velocidade");
        }
        return velocidadeAtual;
    }

    public int frear(int velocidadeAtual, int velocidadeMaxima){

        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMaxima = velocidadeMaxima;
        if(this.velocidadeAtual > 0){
            velocidadeAtual -= 10;
        }else{
            System.out.println("\nVoce esta com o carro parado");
        }
        return velocidadeAtual;
    }

    public void mostrarVelocidade(String modelo, int velocidadeAtual){

        this.velocidadeAtual = velocidadeAtual;
        this.modelo = modelo;
        System.out.println("\nVelocidade atual do "+ modelo);
        System.out.println(velocidadeAtual);

    }
}
