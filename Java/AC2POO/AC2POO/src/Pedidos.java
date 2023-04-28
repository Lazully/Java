import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Pedidos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int qntd;
        double valor, valortotal;
        System.out.println("Olá! De uma conferida no cardapio para digitar o nome e o preço do produto.");
        try {
            File myObj = new File("produtos.txt");
            Scanner leitura = new Scanner(myObj);
            while (leitura.hasNextLine()) {
                String data =leitura.nextLine();
                System.out.println(data);
            }
            leitura.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ocorreu um erro");
            e.printStackTrace();
        }
            System.out.println("Digite o nome do produto:");
            nome = teclado.nextLine();
            System.out.println("Digite o valor do produto:");
            valor = teclado.nextDouble();
            System.out.println("Digite a quantidade do produto:");
            qntd = teclado.nextInt();
            valortotal=valor*qntd;
            System.out.println("Situação do pedido: PG ou NP");
            String situação= teclado.nextLine();
            try {
                FileWriter escreve_pedidos = new FileWriter("pedidos.txt",true);
                escreve_pedidos.write("\nNome: "+nome+", Quantidade: "+qntd+ ", Valor Total: "+valortotal+ ", Situação:"+situação);
                escreve_pedidos.flush( );
                escreve_pedidos.close();

                System.out.println("Arquivo ecrito com sucesso!");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }




    }
    }

