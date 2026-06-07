import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        ArrayList<Produto> estoque = new ArrayList<>();
        int acao = 0;

        while (acao != 3) {
            System.out.println("\nEcolha uma das opcoes no menu:");
            System.out.println("1 - Castrar produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Sair");
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
                                
                    break;        
            
                default:
                    break;
            }
            
               
        }
         leitor.close();    
              
    }

}