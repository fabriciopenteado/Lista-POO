public class ContaBancaria {

    String titular;
    Double saldo;
    double credito;
    double debito;

    public double depositar(double saldo, double credito){
        this.credito = credito;
        this.saldo = saldo;

        saldo = this.saldo + this.credito;
        System.out.println("\nDeposito realizado com suesso " + saldo + this.saldo);
        return saldo;

    }
    
    public double sacar(double saldo, double debito){
        this.debito = debito;
        this.saldo = saldo;
        
        if(saldo >= this.debito){
            saldo = this.saldo - this.debito;
            System.out.println("\nSaque realizado com suesso");
              
        } else{
            System.out.println("\nSaldo insuficiente");
        }
        return saldo;
    }

    public void mostrarSaldo(String titular, double saldo){
        this.saldo = saldo;
        this.titular = titular;
        System.out.println("\nTitular: "+ this.titular);
        System.out.printf("Saldo em conta R$ %.2f \n", this.saldo);
    }


}
