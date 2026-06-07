import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        int acao = -1;
        String titular = "Fabricio";
        Double saldo = 100.00;
        Double credito = 0.0;
        Double debito = 0.0;

        while (acao != 0) {
            System.out.println("\nEscolha uma das opcoes no menu");
            System.out.println("1 - Para depositar");
            System.out.println("2 - Para sacar");
            System.out.println("3 - Para Saldo");
            System.out.println("0 - Para Sair");
            acao = leitor.nextInt();
            leitor.nextLine();
        
            if (acao == 1) {
                System.out.println("Informe o valor para deposito:");
                credito = leitor.nextDouble();
                leitor.nextLine();
                saldo = conta.depositar(saldo,credito );
            }
            if (acao == 2) {
                System.out.println("Informe o valor para deposito:");
                debito = leitor.nextDouble();
                leitor.nextLine();
                saldo = conta.sacar(saldo, debito);
            }
            if (acao == 3) {
                conta.mostrarSaldo(titular, saldo);
            }
            if (acao == 0) {
                break;
            }
       
        }

    }
    
}
