//bibliotecas
import java.util.Scanner;

/******************************************************************************

Escreva um algoritmo que leia uma sequência de números do usuário e realize a
soma desses números. Encerre a execução quando um número negativo for digitado.

*******************************************************************************/

public class Ex3Lista1
{
	public static void main(String[] args) {
	    //apresentação
		System.out.println("Oii! Por favor, digite uma sequência de números abaixo, assim eu poderei lê-los e então somá-los (até que seja digitado um número negativo).");

        //scanner e variáveis
        Scanner digita = new Scanner (System.in);
        double n=0, soma=0;
        
        //laço de repetição
        while (n>=0) {
            
            if (n>=0) {
                
                //instrução
                System.out.println("Digite um número, por favor. Se houver decimal, favor utilizar '.' ao invés de ',': ");
                n = digita.nextDouble();
                
                //Calcula
                soma = n + soma;
                
                System.out.println("A soma dos valores é: " + soma);
                
            } //fim do if
            
        } //fim do while
        
} //fim da main

} //fim da public class
