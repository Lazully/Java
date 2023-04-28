import java.util.Scanner;

public class AppVinho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] vector = new int[3];
		
		Vinho [] listaVinhos = new Vinho[3];

		listaVinhos[0] = new Vinho();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do vinho 1: ");
		String nomeVinho = entrada.next();

		System.out.println("Digite o tipo do vinho 1: ");
		String tipoVinho = entrada.next();
		
		System.out.println("Digite o ano de fabricao do vinho 1: ");
		int anoVinho = entrada.nextInt();
		
		System.out.println("Digite o preco do vinho 1: ");
		double precoVinho = entrada.nextDouble();
		
		listaVinhos[0].setNome(nomeVinho);
		listaVinhos[0].setTipo(tipoVinho);
		listaVinhos[0].setAnoFabricacao(anoVinho);
		listaVinhos[0].setPreco(precoVinho);
		
		int idade = listaVinhos[0].calculaIdade(2021);
		
		System.out.println("Nome: " + listaVinhos[0].getNome());
		System.out.println("Idade: " + idade);

		
		// informacoes vinho2
		listaVinhos[1] = new Vinho("Brunello", "doce", 2005, 500);
		
		int idadeVinho2 = listaVinhos[1].calculaIdade(2021);
		
		System.out.println("Nome: " + listaVinhos[1].getNome());
		System.out.println("Idade: " + idadeVinho2);

		// informacoes vinho3
		listaVinhos[2] = new Vinho("Sangiovese", "seco", 2000, 3000);
		
		int idadeVinho3 = listaVinhos[2].calculaIdade(2021);
		
		System.out.println("Nome: " + listaVinhos[2].getNome());
		System.out.println("Idade: " + idadeVinho3);
		
	
		// verifica o vinho mais caro
		String nomeMaisCaro = retornaMaisCaro(listaVinhos);
		System.out.println("O vinho mais caro é o: " + nomeMaisCaro);
				
		// verifica o vinho mais velho
		// poderia ser verificado com uma funcao, assim como fiz no vinho mais caro
		// mas, vou deixar usando if e else só para voces verem como seria
		int anoAtual = 2021;
		
		if ( (listaVinhos[0].calculaIdade(anoAtual) > listaVinhos[1].calculaIdade(anoAtual) ) & (listaVinhos[0].calculaIdade(anoAtual) > listaVinhos[2].calculaIdade(anoAtual)) ){
			
			System.out.println("O vinho mais velho é o: " + listaVinhos[0].getNome() );
			
		}
		
		else if ( (listaVinhos[1].calculaIdade(anoAtual) > listaVinhos[0].calculaIdade(anoAtual) ) & (listaVinhos[1].calculaIdade(anoAtual) > listaVinhos[2].calculaIdade(anoAtual)) ){
			System.out.println("O vinho mais velho é o: " + listaVinhos[1].getNome() );
		}
		
		else {
			System.out.println("O vinho mais velho é o: " + listaVinhos[2].getNome() );			
		}
		
	}
	
	public static String retornaMaisCaro( Vinho [] listaVinhos ) {
		
		// incialmente, estou dizendo que o primeiro vinho e o mais caro
		Vinho vinhoMaisCaro = listaVinhos[0];

		for(int i=1; i<listaVinhos.length; i++) {
			
			if(listaVinhos[i].getPreco() > vinhoMaisCaro.getPreco()) {
				vinhoMaisCaro = listaVinhos[i];
			}
		}
		
		return vinhoMaisCaro.getNome();
		
	}

}
