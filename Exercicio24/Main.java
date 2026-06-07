import java.util.*;

public class Main {
    public static void main(String[] args) {
        

        Aluno aluno1 = new Aluno("Fabricio");
        Aluno aluno2 = new Aluno("Penteado", 10, 10);
        aluno1.alterarNotas(8,8);
        aluno1.calcularMedia();
        aluno2.calcularMedia();
        aluno1.mostrarDados();
        aluno2.mostrarDados();
    
    }
    
}
