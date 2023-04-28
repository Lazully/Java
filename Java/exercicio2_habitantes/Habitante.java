
public class Habitante {
	
	private double salario;
	private int idade;
	private int numero_filhos;
	
	public Habitante(double salario, int idade, int numero_filhos) {
		this.setSalario(salario);
		this.setIdade(idade);
		this.setNumero_filhos(numero_filhos);
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getNumero_filhos() {
		return numero_filhos;
	}
	
	public void setNumero_filhos(int numero_filhos) {
		this.numero_filhos = numero_filhos;
	}

}
