//bibliotecas
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.*;
import java.io.*;

/******************************************************************************

Construa um programa em Java que solicite uma frase ao usuário e transforme as
letras para maíúscula. - OK
Depois, conte o número de caracteres total e o - OK
número de palavras da frase (palavra é definida por qualquer sequência de caracteres delimitada por espaços em
branco) e exiba o resultado. - OK
Por fim, substitua todos os espaços em branco da frase por “-”
(exemplo: a frase “sei que nada sei”, se tornará “sei-que-nada-sei”). - 

*******************************************************************************/

public class Ex5Lista1
{
	public static void main(String[] args) {
	    
	    //Scanner
	    Scanner frase = new Scanner (System.in);
	    
	    //apresentação
		System.out.println("Oie! Tudo bem? Hoje vamos deixar a frase que você digitar em letras maiúsculas.");
        
        //declaração de variáveis
        String tFrase;
        //public int length();
        // String[] palavra = tFrase.split(" ");
        
        //dar instruções
        System.out.println("Digite uma frase: ");
        tFrase = frase.nextLine();
        
        //declarando objetos
        String converteMaior = "";
        
        //função do programa
        
            //minúsculo para maiusculo
        converteMaior = tFrase.toUpperCase();
        System.out.println("Frase em maiúsculo: " + converteMaior);
        
            //conta palavras sem contrar espaços
        String[] palavra = tFrase.split(" ");
        System.out.println("\nA quantidade de palavras é: " + palavra.length);
        
            //conta número de caractere
        System.out.println("\nQuantidade de caracteres: \n" + tFrase.length());
        
            //substituição dos espaços
        String sub = tFrase.replace(" ", "-");
        System.out.println("\nFrase com substituição do ' ' para '-': \n" + sub);
        
        }
        
} //fim da main
