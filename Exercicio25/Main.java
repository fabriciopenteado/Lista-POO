import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String titular = "Fabricio";
        Double saldo = 100.00;
        
        ContaBancaria conta1 = new ContaBancaria("Fabricio");
        ContaBancaria conta2 = new ContaBancaria("Penteado", 100.0); 

        saldo = conta1.depositar(80.0);
        saldo = conta1.sacar(20.0);
                   
        saldo = conta2.depositar(50);
        saldo = conta2.sacar(10.0);
        
        conta1.mostrarSaldo(titular,saldo);
        conta2.mostrarSaldo(titular, saldo);


    }
    
}
