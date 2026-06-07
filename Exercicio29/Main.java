import java.util.*;

public class Main {
    public static void main(String[] args) {
     
    Aluno aluno = new Aluno();
    aluno.setNome("Fabricio");
    aluno.setIdade(42);
    aluno.setNota(10);

    Professor professor = new Professor();
    professor.setNome("Jorge");
    professor.setIdade(53);
    professor.setDisciplina("Geografia");

    aluno.mostrarDados();
    professor.mostrarDados();    

    }
}