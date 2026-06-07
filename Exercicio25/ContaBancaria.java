public class ContaBancaria {

    String titular;
    Double saldo;
    
    public ContaBancaria(String titular){ 
        this.titular = titular;
        this.saldo = 0.0;
    } 
    
    public ContaBancaria (String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public double depositar(double saldo){
        //this.saldo = saldo;

        this.saldo += saldo;
        System.out.println("\nDeposito realizado com suesso ");
        System.out.printf("Saldo em conta R$ %.2f \n", this.saldo);
        return this.saldo;

    }
    
    public double sacar(double saldo){
        
        //this.saldo = saldo;
                   
        if(this.saldo >= saldo){
            this.saldo = this.saldo - saldo;
            System.out.println("\nSaque realizado com suesso");
            System.out.printf("Saldo em conta R$ %.2f \n", this.saldo);
              
        } else{
            System.out.println("\nSaldo insuficiente");
        }
        return this.saldo;
    }

    public void mostrarSaldo(String titular, double saldo){
        //this.saldo = saldo;
        //this.titular = titular;
        System.out.println("\nTitular: "+ this.titular);
        System.out.printf("Saldo em conta R$ %.2f \n", this.saldo);
    }


}
