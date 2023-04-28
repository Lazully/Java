//bibliotecas
import java.util.Scanner;

/******************************************************************************

 Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    //apresentação
		System.out.println("Oie! Neste programa, você irá me dizer o dia que você nasceu, assim poderei contar quantos dias você viveu até agora :)");
		
		//variáveis para coletar os dados fornecidos
		Scanner sc = new Scanner (System.in);
		int d, m, a, DiasVividos;
		
		//instruir e coletar
		System.out.println("Informe sua idade conforme pedido a seguir.\n\n");
		
		System.out.println("Digite quantos dias (em números): ");
		d = sc.nextInt();
		
		System.out.println("Digite quantos meses (em números): ");
		m = sc.nextInt();
		
		System.out.println("Digite quantos anos (em números): ");
		a = sc.nextInt();

        //conta
        //ano=365
        //mes=30
        
        DiasVividos = (a * 365) + (m * 30) + d;
        
        //saída
        System.out.println("A sua idade em dias é: " + DiasVividos);
	}
}
