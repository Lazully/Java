
public class ContaEspecial extends Conta{
	
	private double limite;
	
	public ContaEspecial(int numero, Cliente titular){
		super(numero, titular);
		this.limite = 500;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public String imprimir(){
		
		String info = "";
		info  += super.imprimir();
		info += "\nLimite: " + this.limite;
		
		return info;
	}
	
	public boolean sacar(double quantia) {
		
		double saldoComLimite = this.getSaldo() + this.limite;
		
		if( (saldoComLimite - quantia) >=0) {
			this.setSaldo( this.getSaldo()-quantia );
			return true;
		}
		else {
			return false;
		}
		
	}

}
