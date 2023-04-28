import javax.swing.JOptionPane;

public class AppBanco {
	
	public static void main(String[] args) {

		String menuPrincipal = "0. Cadastrar cliente\n"
				  +	"1. Cadastrar conta\n"
			      + "2. Cadastrar conta especial\n"
			      + "3. Relatorios\n"
			      + "4. Movimentacao\n"
				  + "5. Sair\n";
		
		String menuRelatorios = "1. Listas todas contas cadastradas\n"
			      + "2. Buscar conta com maior saldo\n"
			      + "3. Buscar conta com saldo negativo\n"
			      + "4. Buscar contas pelo CPF\n" 
		          + "5. Sair\n";

		String menuMovim =  "1.Efetuar um deposito"
			      			+ "2.Efetuar um saque";

		
		GerenciarClientes gerenciaCli = new GerenciarClientes();
		GerenciarContas gerenciaContas = new GerenciarContas();
		
		int opcaoMenu = 0;
		while(opcaoMenu!=5) {
			
			opcaoMenu = Integer.parseInt( JOptionPane.showInputDialog(menuPrincipal) );
			
			switch (opcaoMenu) {
			case 0:{
				Cliente cliente = cadastrarCliente();
				
				// adiciona o cliente na lista de clientes
				gerenciaCli.cadastrar(cliente);
				break;
			}
			case 1:{
				int tipoConta = 0;
				Conta conta = cadastrarConta( gerenciaCli, tipoConta );
				
				// adiciona o conta na lista de conta
				gerenciaContas.cadastrar(conta);
				break;
			}
			case 2:{
				int tipoConta = 1;
				Conta conta = cadastrarConta( gerenciaCli, tipoConta );
				
				// adiciona o conta na lista de conta
				gerenciaContas.cadastrar(conta);
				break;
			}
			case 3:{
				telaRelatorios(menuRelatorios, gerenciaContas);
				break;
			}
			case 4:{
				JOptionPane.showMessageDialog(null,  "Implementar o codigo que chama a tela de movimentacao" );
				break;
			}			
			default:{
				JOptionPane.showMessageDialog(null,  "Opcao invalida" );
				break;
			}
			}
			
		}
	}
	
	public static Cliente cadastrarCliente(){
		
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		String cpf = JOptionPane.showInputDialog("Digite o cpf: ");
		String ender = JOptionPane.showInputDialog("Digite o endereco: ");
		String telefone = JOptionPane.showInputDialog("Digite o telefone: ");
		
		Cliente cliente = new Cliente(cpf, nome, ender, telefone);
		
		return cliente;
	}
		
	public static Conta cadastrarConta( GerenciarClientes gerenciaCli, int tipoConta){
		
		int numero = Integer.parseInt( JOptionPane.showInputDialog("Digite o numero: ") );

		Cliente cliente = null;
		
		while(cliente==null){
		
			String cpf = JOptionPane.showInputDialog("Digite o cpf do titular da conta: ");		
	
			// busca o cliente pelo CPF digitado
			cliente = gerenciaCli.buscar(cpf);
			
			if(cliente==null) {
				JOptionPane.showMessageDialog(null, "Erro. Esse cliente nao existe");
			}
		}
		
		if(tipoConta==0){
			Conta conta = new Conta(numero, cliente);
			return conta;
		}
		else{
			Conta conta = new ContaEspecial(numero, cliente);
			return conta;
		}
			
	}
	
	public static void telaRelatorios(String menuRelatorios, GerenciarContas gerenciaContas){
		
		int opcaoMenu = 0;
		while(opcaoMenu!=5) {
			
			opcaoMenu = Integer.parseInt( JOptionPane.showInputDialog(menuRelatorios) );
			
			switch (opcaoMenu) {
			case 1:{
				JOptionPane.showMessageDialog(null, gerenciaContas.imprimirContas() );
				break;
			}
			case 2:{
				Conta conta = gerenciaContas.maiorSaldo();
				JOptionPane.showMessageDialog(null,  conta.imprimir() );
				break;
			}
			case 3:{
				JOptionPane.showMessageDialog(null,  gerenciaContas.buscarNegativados() );
				break;
			}
			case 4:{
				JOptionPane.showMessageDialog(null,  "Implementar codigo que busca pelo CPF" );
				break;
			}
			case 5:{
				break;
			}
			default:{
				JOptionPane.showMessageDialog(null,  "Opcao invalida" );
				break;
			}
			}
			
		}
	}
	
}
