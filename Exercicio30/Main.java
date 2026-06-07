import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int acao = 0;
        String nome = "";
        double salario = 0.0;
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        while (acao != 4 ) {
            Funcionario funcionario = new Funcionario(nome, salario);
            System.out.println("\nEscolha uma opçao:");
            System.out.println("1 - Castrar gerente");
            System.out.println("2 - Castrar vendedor");
            System.out.println("3 - Listar funcionario");
            System.out.println("4 - Sair");

            acao = leitor.nextInt();
            leitor.nextLine();

            switch (acao) {
                case 1:
                    System.out.println("Digite o nome do Gerente:");
                    nome = leitor.nextLine();
                    System.out.println("Digite o salario");
                    salario = leitor.nextDouble();
                    leitor.nextLine();

                    Gerente gerente = new Gerente(nome, salario);
                    salario = gerente.calcularSalarioFinal();
                    funcionario.setNome(nome);
                    funcionario.setSalario(salario);
                    funcionarios.add(funcionario);
                    break;
                 
                case 2:

                    System.out.println("Digite o nome do Vendedor:");
                    nome = leitor.nextLine();
                    System.out.println("Digite o salario");
                    salario = leitor.nextDouble();
                    leitor.nextLine();
                    System.out.println("Digite a quantidade de vendadas");
                    int quantidadeVendas = leitor.nextInt();
                    leitor.nextLine();

                    Vendedor vendedor = new Vendedor(nome, salario, quantidadeVendas);
                    vendedor.setQuantidadeVendas(quantidadeVendas);
                    salario = vendedor.calcularSalarioFinal();
                    funcionario.setNome(nome);
                    funcionario.setSalario(salario);
                    funcionarios.add(funcionario);
                    break;
               
                case 3:
                    for(int i = 0; i < funcionarios.size();i++){
                        System.out.println(funcionarios.get(i));
                    }
                    break;
                
                case 4:
                    break;
                default:
                    break;
            
                }

        }
        
        leitor.close();
    }
}
