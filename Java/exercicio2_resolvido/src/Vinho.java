
public class Vinho {
	
	private String nome;
	private String tipo;
	private int anoFabricacao;
	private double preco;
	
	// construtor para receber so o nome
	public Vinho(String nome) {
		this.nome = nome;
	}
	
	// construtor para receber todos os atributos
	public Vinho(String nome, String tipo, int anoFabricacao, double preco) {
		this.nome = nome;
		this.tipo = tipo;
		this.anoFabricacao = anoFabricacao;
		this.preco = preco;
	}

	// construtor para nao receber nada
	public Vinho() {
		this.nome = "NomeNaoInformado";
		this.tipo = "doce";
		this.anoFabricacao = 0;
		this.preco = 0;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome( String nome ) {
		this.nome = nome;
	}
	
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int calculaIdade(int anoAtual){
		
		int idade = anoAtual - this.anoFabricacao;
		
		return idade;
	}

}
