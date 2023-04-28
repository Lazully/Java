
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Cliente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcaoP;
        String nome;
        String cpf;
        String cnpj;
        String email;
        System.out.print("1. Pessoa Física \n2. Pessoa Jurídica\n");
        opcaoP = teclado.nextInt();
        switch (opcaoP) {
            case 1:
                System.out.println("Digite o nome do cliente:");
                nome = teclado.next();
                System.out.println("Digite o CPF do cliente:");
                cpf = teclado.next();
                System.out.println("Digite o email do cliente:");
                email = teclado.next();
                try {
                    FileWriter escreve_clientes = new FileWriter("clientes.txt",true);
                    escreve_clientes.write("\nNome: "+nome+", CPF: "+cpf+", email: "+email+"");
                    escreve_clientes.flush( );
                    escreve_clientes.close();

                    System.out.println("Arquivo ecrito com sucesso!");
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
                break;
            case 2:
                System.out.println("Digite o nome do cliente:");
                nome = teclado.next();
                System.out.println("Digite o CNPJ do cliente:");
                cnpj = teclado.next();
                System.out.println("Digite o email do cliente:");
                email = teclado.next();
                try {
                    FileWriter escreve_clientes = new FileWriter("clientes.txt");
                    escreve_clientes.write("Nome:"+nome+"CNPJ"+cnpj+"email"+email);
                    escreve_clientes.close();
                    System.out.println("Arquivo ecrito com sucesso!");
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
                break;
        }


    }
}

