//bibliotecas
import java.util.Scanner;

/******************************************************************************

Faça um programa que receba dois números e execute as operações listadas a
seguir de acordo com a escolha do usuário:
Escolha do usuário                          Operação
1                                           Média entre os números digitados
2                                           Diferença entre os números
3                                           Produtos entre os números digitados
4                                           Divisão do primeiro pelo segundo
Você deve usar a estrutura switch para a escolha do usuário. Além disso, você deve criar
uma função para cada operação.

*******************************************************************************/

public class Ex2Lista
{
	public static void main(String[] args) {
	    
	    //apresentação
		System.out.println("Oie! Conte-me dois números, e me diga o que fazer!");
		
		//variáveis para coletar os dados fornecidos
		Scanner NomeLegal = new Scanner (System.in);
        double n1, n2, media, diferenca, produto, divisao;
        int op;
        
        //instruir e coletar
        System.out.println("Qual a primeira variável? ");
        n1 = NomeLegal.nextDouble();
        
        System.out.println("Qual a segunda variável? ");
        n2 = NomeLegal.nextDouble();
        
        //recebe instruções
        System.out.println("1. Média entre os números digitados \n 2. Diferença entre os números \n 3. Produtos entre os números digitados \n 4. Divisão do primeiro pelo segundo \n\n\nQual operação deseja solicitar? ");
        op = NomeLegal.nextInt();
        
        switch (op){
            case 1:
                media = (n1 + n2) / 2;
                System.out.println("A média entre os dois valores é: " + media);
             break;
            
            case 2:
                diferenca = n1 - n2;
                System.out.println("A diferença entre os valores é: " + diferenca);
             break;
            
            case 3:
                produto = n1 * n2;
                System.out.println("O produto entre os dois números é: " + produto);
             break;
            
            case 4:
                divisao = n1 / n2;
                System.out.println("A divisão entre o primeiro pelo segundo é: " + divisao);
             break;
        }
	}
}
