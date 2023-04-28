//bibliotecas
import java.util.Scanner;

/******************************************************************************

Um usuário deseja um algoritmo onde possa escolher que tipo de média deseja
calcular a partir de 3 notas. Faça um algoritmo que leia as notas e armazene em um vetor.
Depois, leia a opção escolhida pelo usuário e calcule a média.
1 -aritmética
2 -ponderada (pesos: 2,2,4)
Você deve criar uma função para calcular a média aritmética e outra para calcular a média
ponderada.

*******************************************************************************/

public class Ex4Lista1
{
	public static void main(String[] args) {
	    //apresentação
		System.out.println("Oii! Neste programa, você deverá informar as três notas e então o tipo de média que deverá ser feito.\n\nFavor digitar valores decimais com '.' ao invés de ','.");

        //scanner e variáveis - necessário vetor
        Scanner Nota = new Scanner (System.in);
        double [] n = new double[3];
        int opcao;
        double [] x;
        int op;
        
        //recebe
        System.out.println("Primeira nota: ");
        n[0] = Nota.nextDouble();
        System.out.println("Segunda nota: ");
        n[1] = Nota.nextDouble();
        System.out.println("Terceira nota: ");
        n[2] = Nota.nextDouble();
        
        System.out.println("Muito obrigada! Agora selecione o tipo de média: \n\n1. Média Aritmética\n2.Média Ponderada (peso 2, 2, 4)");
        opcao = Nota.nextInt();
        
        media(n, opcao);
        
	}// fim da main
	
        //operações da escolha
        public static void media (double [] n, int opcao) {
            switch (opcao){
            case 1:

                System.out.println("A média Aritmética é: " + (n[0] + n[1] + n[2]) / 3);
            
            break;
            
            case 2:
            
                System.out.println("A média Ponderada é: " + ((n[0] * 2) + (n[1] * 2) + (n[2] * 4)) / 8);
            
            break;
        } //fim switch
        } //fim media
}


