import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        ArrayList<Produto> estoque = new ArrayList<>();
        int acao = 0;
        double acumuladora = 0;

        while (acao != 4) {
            System.out.println("\nEcolha uma das opcoes no menu:");
            System.out.println("1 - Castrar produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Mostrar valor total do estoque");
            System.out.println("4 - Sair");
            acao = leitor.nextInt();
            leitor.nextLine();

            switch (acao) {
                case 1:
                    Produto p = new Produto();
                    System.out.println("Digite o nome do produto");
                    p.nome = leitor.nextLine();
                    System.out.println("Digite o valor do produto");
                    p.preco = leitor.nextDouble();
                    leitor.nextLine();
                    System.out.println("Digite a quatidade");
                    p.quantidade = leitor.nextInt();
                    leitor.nextLine();   
                    
                    estoque.add(p);
                           
                    break;
                case 2:
                    for(int i = 0;i < estoque.size() ; i++) {
                        estoque.get(i).mastrarDados();            
                    } 
                    break;
                
                case 3:
                    for(int i = 0;i < estoque.size() ; i++) {
                        acumuladora += estoque.get(i).calculaValorTotal();            
                    }             
                    System.out.printf("\nO Valor total de estoque eh: R$ %.2f",acumuladora);
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