import java.util.ArrayList;

public class GerenciarContas {
	
	private ArrayList<Conta> listaConta;
	
	public GerenciarContas(){
		listaConta = new ArrayList<Conta>();
	}
	
	public void cadastrar(Conta conta){
		this.listaConta.add(conta);
	}
	
	public String imprimirContas(){
		
		String info = "";
		
		if(this.listaConta.size()==0){
			info += "Erro. A lista esta vazia";
		}
		else{
			 
			for(Conta conta: this.listaConta){
				
				info += "\n==================";
				info += conta.imprimir();
				
			}	
		}
		
		return info;	
	}
	
	public Conta buscar(int numeroConta){
		
		for(Conta conta: this.listaConta) {
			if(conta.getNumero()==numeroConta) {
				return conta;
			}
		}
		
		return null;
		
	}
	
	public Conta buscar(String cpf){
		
		for(Conta conta: this.listaConta) {
			if(conta.getTitular().getCpf().equalsIgnoreCase(cpf)) {
				return conta;
			}
		}
		
		return null;
	}
	
	public String buscarMinimo(double valor){
		
		String info = "";
		
		for(Conta conta: this.listaConta) {
			
			if(conta.getSaldo()>=valor) {
				info += "\n==========\n";
				info += "\nNumero da conta: " + conta.getNumero();
				info += "\nSaldo: " + conta.getSaldo();
			}
			
		}
		
		return info;
		
	}
	
	public String buscarNegativados(){
		
		String info = "";
		
		for(Conta conta: this.listaConta) {
			
			if(conta.getSaldo()<=0) {
				info += "\n==========\n";
				info += "\nNumero da conta: " + conta.getNumero();
				info += "\nSaldo: " + conta.getSaldo();
			}
			
		}
		
		return info;
		
	}
	
	public Conta maiorSaldo(){
		
		Conta maiorConta = this.listaConta.get(0);
		
		for(int i=1; i<this.listaConta.size(); i++) {
			
			if(listaConta.get(i).getSaldo()>maiorConta.getSaldo()){
				maiorConta = listaConta.get(i);
			}
		}
		
		return maiorConta;
		
	}
}
