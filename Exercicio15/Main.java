import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        String condicao;

        while (true) {
            Produto p = new Produto();
            System.out.println("Digite o nome do produto");
            p.nome = leitor.nextLine();
            System.out.println("Digite o valor do produto");
            p.preco = leitor.nextDouble();
            leitor.nextLine();
            System.out.println("Digite a quatidade");
            p.quantidade = leitor.nextInt();
            leitor.nextLine();   
            produtos.add(p);
            System.out.println("Deseja cadastrar outro produto ou digite 'nao' para encerrar");
            condicao = leitor.nextLine();
            if(condicao.equalsIgnoreCase("nao")){
                break;
            }
        }
        
            for(int i = 0;i < produtos.size() ; i++) {
                produtos.get(i).mastrarDados();
       
            }

        leitor.close();

       
    }

}