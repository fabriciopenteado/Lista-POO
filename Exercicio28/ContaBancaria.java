public class ContaBancaria {

    private String titular;
    private Double saldo = 0.0;
    
    public String getTitular(){
        return titular;

    }

    public double getSaldo(){
        return saldo;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double depositar(double saldo){
        if(saldo >= 0){
            this.saldo += saldo;
            System.out.println("\nDeposito realizado com suesso ");
            System.out.printf("Saldo em conta R$ %.2f \n", this.saldo);
        }else{
            System.out.println("Valor de deposito invalido");
        }    
        return this.saldo;
    }
    
    
    public double sacar(double saldo){
                
        if(this.saldo >= saldo && saldo >= 0){
            this.saldo = this.saldo - saldo;
            System.out.println("\nSaque realizado com suesso");
            System.out.printf("Saldo em conta R$ %.2f \n", this.saldo);
              
        } else{
            System.out.println("\nSaldo insuficiente ou valor invalido");
        }
        return this.saldo;
    }

    public void mostrarSaldo(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
        System.out.println("\nTitular: "+ this.titular);
        System.out.printf("Saldo em conta R$ %.2f \n", this.saldo);
    }


}
