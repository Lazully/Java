//bibliotecas
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.Locale;
import java.util.*;
import java.io.*;

/******************************************************************************

Faça um programa que peça ao usuário para digitar um tamanho desejado para um
vetor. - OK
Depois, peça para ele digitar os números que devem ser armazenados neste vetor. - OK
Crie uma função que receba esse vetor e retorne o maior número. -OK
No programa principal, chame essa função e imprima o número retornado por ela. -OK

*******************************************************************************/

public class Ex6Lista1
{
	public static void main(String[] args) {
	    //apresentação
		System.out.println("Oie! Precisa armazenar algo? Posso te ajudar! Vou te fazer algumas perguntas.");
		
		//Scanner
		Scanner variaveis = new Scanner (System.in);
		
		//declaração de variáveis
		int espacoVetor;
		int i;
		//double n[] = new double[espacoVetor];
		
		//instrução
		System.out.println("Qual o tamanho do vetor? ");
		espacoVetor = variaveis.nextInt();
		
		double n[] = new double[espacoVetor];
		
		    //for para números
		for(i = 0; i < espacoVetor; i++) {
		    System.out.println("Digite os valores: ");
		    n[i] = variaveis.nextDouble();
		}//fim for
            
            System.out.println("O maior valor encontrado é: " + maior(n));
            
        }// fim da main
        
        //função para o número maior
        public static double maior (double n[]){
            //variaveis
            double x = 0;
            int j = 0;
            
                for(j = 0; j < n.length; j++){
                    if(n[j] > x){
                        x = n[j];
                    }//fim if maior
                }//fim for maior
                return x;
        }//fim da função maior
        
} //fim da public class
