import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fornecedores {
    //a empresa possui apenas um único fornecedor para cada produto. Sendo que
//armazena de cada fornecedor: CNPJ e Nome do Fornecedor.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        String cnpj;
        System.out.println("Escreva o nome do fornecedor:");
        nome = teclado.nextLine();
        System.out.println("Escreva o cnpj do fornecedor");
        cnpj = teclado.next();
        try {
            FileWriter escreve_fornecedores = new FileWriter("fornecedores.txt",true);
            escreve_fornecedores.write("\nNome: "+nome+", CNPJ: "+cnpj);
            escreve_fornecedores.flush( );
            escreve_fornecedores.close();

            System.out.println("Arquivo ecrito com sucesso!");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }



    }

}
