import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				//Faça um programa em Java que peça ao usuário para digitar um texto
				//e informe quantos caracteres possui o texto informado pelo usuário.
				//(Utilize o método length()).
				
				//variáveis
				String scanTexto;
				Scanner input = new Scanner (System.in);
				
				//imprime o texto na tela
				System.out.println("Oiê! Tudo bem? Sou um programa em Java, e a minha função é informar quantos caracteres seu texto possui (incluindo espaço).\n Por favor, informe o texto que você deseja contar.");
				
				//scan do texto pelo usuário
				scanTexto = input.nextLine();
				
				//saída
				System.out.println("O seu texto possui: "+scanTexto.length());
	}
}
