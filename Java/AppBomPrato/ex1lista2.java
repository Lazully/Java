//bibliotecas
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Locale;
import java.util.*;
import java.io.*;

/******************************************************************************

Efetuar o pedido de produtos, informando o código e quantidade desejada. - OK
Fechar a conta de uma mesa de acordo com o total da conta e o tipo depagamento. - OK
Pedir qnt de pessoas e dividir pelo total. - OK
Imprimir dados. - OK
classe AppBomPrato (que contenha o método main) com as seguintes ações:
 1) Criar 2 mesas; - OK
 2) Imprimir todas as mesas; - OK
 3) Efetuar 2 pedidos para cada mesa;
 4) Calcular e imprimir o valor final da conta e por pessoa;
 5) Imprimir a mesa com o maior valor gasto por pessoa;

*******************************************************************************/

public class Ex1Lista2
{
	public static void main(String[] args) {
	    //scanner
	    Scanner Pedido = new Scanner (System.in);
	    
	    //variáveis
	    int op_produto, n, op_pagamento;
	    int cardapio;
	    char continuar;
	    double total = 0.00, total1=0.00, total2=0.00, total3=0.00;
	    double discTotal=0.00;
	    int qntPessoas;
	    double pagarPessoas=0.00;

	    //vetor para as mesas
		int vetorMesas[] = new int [24]; //supondo que o restaurante possua 24 mesas
		char mesa;

	    System.out.println("---------- APP BOM PRATO ----------");
	    
	    int i = 1;
	    
	    do {
			System.out.println("Por favor, informe o número da mesa: ");
			vetorMesas[i++] = Pedido.nextInt();
	       

        //Cardápio, pedido e quantidade - loop
			do{
				System.out.println("\n\nProdutos: \n1. Suco - R$5,00 \n2. Bauru - R$15,00 \n3. Coxinha Frita - R$6,00 \n\nQual produto desejado (1, 2 ou 3)?");
				op_produto = Pedido.nextInt();
				System.out.println("Quantas unidades? ");
				n = Pedido.nextInt();
				System.out.println("Deseja inserir outro produto?[S/N] ");
				continuar = Pedido.next().charAt(0);


				//suco
				if (op_produto == 1){
					total1 = 5*n;
					System.out.println("Total: " + total1);
				}
				//bauru
				if (op_produto == 2){
					total2 = 15*n;
					System.out.println("Total: " + total2);
				}
				//Coxinha
				if (op_produto == 3){
					total3 = 6*n;
					System.out.println("Total: " + total3);
				}
			}while(continuar == 'S' || continuar == 's');

			total = total1+total2+total3;

			System.out.println("Total a pagar: " + total);

			System.out.println("\nQual a opção de pagamento? \n1.Cartão de Débito \n2.Cartão de Crédito \n3.Dinheiro ");
			op_pagamento = Pedido.nextInt();
			
        
        //Qnt pessoas
        System.out.println("Quantidade de pessoas na mesa: ");
        qntPessoas = Pedido.nextInt();
        
        //chamada da função pgmto e passada das variaveis
        pgmto (total, op_pagamento, discTotal, pagarPessoas, qntPessoas);
        
        System.out.println("\n------------------------------- ");
        System.out.println("Deseja informar outra mesa? ");
		mesa = Pedido.next().charAt(0);
	    }while (mesa == 'S' || mesa =='s');
	    
	    for (i=1; i<25; i++)
	    {
	        System.out.println("---------- Mesa " + i+ " ----------");
	        System.out.println("Mesas: " + vetorMesas[i]);
	        if(vetorMesas[i] > 0)
	        {
	            System.out.println("Ocupada");
	        }
	    }
	    
	   System.out.println("Obrigada por usar o programa!");
	   System.out.println("---------- Fim do Progama ----------");
	   
	}//fim da static
	
	    public static void pgmto (double total, int op_pagamento, double discTotal, double pagarPessoas, int qntPessoas){
        switch(op_pagamento){
	        //cartão de débito
	        case 1:
	            discTotal = total - (total*0.1);
	            pagarPessoas = discTotal/qntPessoas;
	            System.out.println("O total a pagar com desconto de 10% é: " + discTotal);
	            System.out.println("O valor a ser pago por pessoa é de: " + pagarPessoas);
	            break;
	        //cartão de Crédito
	        case 2:
	            discTotal = total;
	            pagarPessoas = total/qntPessoas;
	            System.out.println("Não há desconto para cartão de crédito. O total a pagar é: " + discTotal);
	            System.out.println("O valor a ser pago por pessoa é de: " + pagarPessoas);
	            break;
	        //Dinheiro
	        case 3:
	            discTotal = total - (total*0.15);
	            pagarPessoas = discTotal/qntPessoas;
	            System.out.println("O total a pagar com desconto de 15% é: " + discTotal);
	            System.out.println("O valor a ser pago por pessoa é de: " + pagarPessoas);
	            break;
	    }
	            System.out.println("\n------------ Resumo: ------------");
	            System.out.println("O total da mesa é: " + discTotal);
                System.out.println("A quantidade de pessoas na mesa é " + qntPessoas);
                System.out.println("Valor a ser pago por pessoa: " + pagarPessoas);
    }

}

