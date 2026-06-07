import java.util.*;

public class Main {
    public static void main(String[] args) {
              
        String modelo = "Fusca";
        int velocidadeAtual = 0;
        int velocidadeMaxima = 100;
        int acao= -1;
        
        Scanner leitor = new Scanner(System.in);
               
        Carro carro = new Carro();

        while (acao != 0) {
            System.out.println("\nEscolha uma das opcoes no menu");
            System.out.println("1 - Para Acelerar");
            System.out.println("2 - Para frear");
            System.out.println("3 - Para mostrar velocidade");
            System.out.println("0 - Para Sair");
            acao = leitor.nextInt();
            leitor.nextLine();
        
            if (acao == 1) {
               velocidadeAtual = carro.acelerar(velocidadeAtual, velocidadeMaxima);
            }
            if (acao == 2) {
               velocidadeAtual = carro.frear(velocidadeAtual, velocidadeMaxima); 
            }
            if (acao == 3) {
               carro.mostrarVelocidade(modelo, velocidadeAtual); 
            }
            if (acao == 0) {
                break;
            }
        }    
    }
  
}
