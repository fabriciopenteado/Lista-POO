import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
        conta.setTitular("Fabricio");
        int acao = -1;
        
        
        while (acao != 0) {
            System.out.println("\nEscolha uma das opcoes no menu");
            System.out.println("1 - Para Depositar");
            System.out.println("2 - Para Sacar");
            System.out.println("3 - Para Saldo");
            System.out.println("0 - Para Sair");
            acao = leitor.nextInt();
            leitor.nextLine();
            
            if (acao == 1) {
                System.out.println("Informe o valor para Deposito:");
                conta.depositar(leitor.nextDouble());
                leitor.nextLine();
                }
            if (acao == 2) {
                System.out.println("Informe o valor para Saque:");
                conta.sacar(leitor.nextDouble());
                leitor.nextLine();
                }
            if (acao == 3) {
                System.out.println("\nTitular: "+ conta.getTitular());
                System.out.printf("Saldo em conta R$ %.2f \n", conta.getSaldo());
                }
            if (acao == 0) {
                break;
                }
            
        }

    }
    
}
