import java.util.ArrayList;

public class GerenciarClientes {
	
	private ArrayList<Cliente> listaClientes;	
	
	public GerenciarClientes(){
		listaClientes = new ArrayList<Cliente>();
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	
	public void cadastrar(Cliente cliente){
		listaClientes.add(cliente);
	}
	
	public String imprimir() {
		
		String info = "";
		
		if(this.listaClientes.size()==0) {
			info += "A lista esta vazia";
		}
		else {
			
			for(Cliente cliente: this.listaClientes){
				info += "\n===========\n";
				info += cliente.imprimir();
			}
			
		}
		
		return info;
		
	}
	
	public Cliente buscar(String cpf){
		
		for(Cliente cliente: this.listaClientes) {
			if(cliente.getCpf().equalsIgnoreCase(cpf)) {
				return cliente;
			}
		}
		
		return null;
	}

}
