import java.util.*;
public class Vendedor extends Funcionario {
    private int quantidadeVendas;

    public Vendedor(String nome, double  salario, int quantidadeVendas) {
        super(nome,salario);
        this.quantidadeVendas = quantidadeVendas;
    } 

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }
    
    public void setQuantidadeVendas(int quantidadeVendas){
        this.quantidadeVendas = quantidadeVendas;
    } 


    public double calcularSalarioFinal(){
        return this.getSalario()+(this.quantidadeVendas*50.00);
    }
}
