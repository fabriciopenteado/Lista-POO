import java.util.*;

public class Gerente extends Funcionario {

    public Gerente(String nome, double  salario) {
        super(nome,salario); 
        }
    
    
    public double calcularSalarioFinal(){
        return getSalario()+1000.00;
    }
    
}
