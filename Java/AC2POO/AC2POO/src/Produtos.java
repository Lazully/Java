import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Produtos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        String valor;
        String descrição;
        System.out.println("Escreva o nome do produto:");
        nome =teclado.nextLine();
        System.out.println("Escreva o valor do produto:");
        valor=teclado.nextLine();
        System.out.println("Escreva a descrição do produto:");
        descrição = teclado.nextLine();
        try {
            FileWriter escreve_fornecedores = new FileWriter("produtos.txt",true);
            escreve_fornecedores.write("\nNome: "+nome+", Valor: "+valor+", Descrição: "+descrição);
            escreve_fornecedores.flush( );
            escreve_fornecedores.close();

            System.out.println("Arquivo ecrito com sucesso!");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
