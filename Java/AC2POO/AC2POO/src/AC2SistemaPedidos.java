import javax.swing.JOptionPane;
import java.util.Scanner;

//Quando iniciar o sistema, ele deve verificar se existe em uma pasta chamada
//database, a base de dados preenchida, isto é, um arquivo
//um dos cadastros: Clientes, Produtos, Pedidos e Fornecedores. Caso existe um
//arquivo de texto para um determinado cadastro, essas informações devem ser
//carregadas no respectivo objeto. --> PROFESSOR NÃO VAI ENSINAR
//Quando o usuário clicar na opção 7 do menu (Sair), os arquivos de texto da
//base de dados devem ser atualizados com as informações dos objetos.

public class AC2SistemaPedidos {
    public static void main(String[] args) {
        //Menu de opções:
        String menu = "1. Cadastrar clientes\n" //nome e email
                + "2. Cadastrar fornecedores\n"
                + "3. Cadastrar produtos\n"
                + "4. Efetuar um pedido\n"
                + "5. Baixa de pagamento de um pedido\n"
                + "6. Relatórios\n"
                + "7. Sair\n";
        //Quando o usuário clicar na opção 7 do menu (Sair), os arquivos de texto da
        //base de dados devem ser atualizados com as informações dos objetos.

        String menuRelatorios = "6.1. Listagem de todos os Clientes\n"
                +"6.2. Listagem de todos os Fornecedores\n"
                +"6.3. Listagem de todos os Produtos\n"
                +"6.4. Listagem de todos os Pedidos\n"
                +"6.5. Listagem de todos os pedidos feitos em um determinado intervalo de datas\n"
                +"6.6. Busca de um pedido pelo número\n"
                +"6.7. Listagem de todos os pedidos pagos\n"
                +"6.8. Busca de um produto pelo nome deste\n"
                +"6.9. Cálculo do total dos pedidos em aberto (não pagos).\n";

        //scaner
        Scanner entradaMenu = new Scanner(System.in);

        //perguntar opção:
        System.out.println("Digite a opção escolhida: ");
        int opcao = Integer.parseInt(entradaMenu.next());

        while(opcao != 7) {
            opcao = Integer.parseInt( JOptionPane.showInputDialog(menu) );

            switch (opcao) {
                case 1:{
                    Cliente cliente = new Cliente();

                    break;
                }
                case 2:{
                    int tipoConta = 0;
                    Fornecedores fornecedores = new Fornecedores();

                    break;
                }
                case 3:{
                    int tipoConta = 1;
                    Produtos conta = new Produtos();

                    break;
                }
                case 4:{
                    Pedidos pedido = new Pedidos();

                    break;
                }
                case 5:{
                    Leitura_Pedidos baixa = new Leitura_Pedidos();

                    break;
                }
                case 6:{
                    Relatorio(menuRelatorios);
                    break;
                }
                case 7:{
                    break;
                }
                default:{
                    JOptionPane.showMessageDialog(null,  "Opcao invalida" );
                    break;
                }
            }

        }
    }

    private static void Relatorio(String menuRelatorios) {
        System.out.println("Opção ainda em desenvolvimento");
    }

}

