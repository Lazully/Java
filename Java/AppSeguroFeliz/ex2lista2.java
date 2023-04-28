//bibliotecas

import java.util.Scanner;


/******************************************************************************

 Nome, idade e prêmio - OK
 Acréscimo do prêmio (P.S.: não há nada indicando o valor do prêmio) - OK
 Desconto dependendo da cidade - OK

 Faça a impressão dos dados
 Faça o cálculo da Apolice
 Faça a impressão dos dados novamente
 Faça o cálculo do desconto, informando como parâmetros a cidade de BeloHorizonte
 Faça a impressão dos dados novamente

 *******************************************************************************/

public class Ex2Lista2 {
    public static void main(String[] args) {
        //scanner
        Scanner Apolice = new Scanner(System.in);

        //variáveis
        int idade;
        double valorPremio;
        String nomeSegurado;
        double valorPremio_novo = 0;
        int cidade;
        double valorPremio_cidade = 0;

        //mostra
        System.out.println("Nome: ");
        nomeSegurado = Apolice.nextLine();
        System.out.println("Idade: ");
        idade = Apolice.nextInt();
        System.out.println("Valor do prêmio: ");
        valorPremio = Apolice.nextInt();
        System.out.println("Cidade do ganhador: \n1.Curitiba \n2.Rio de Janeiro \n3.Belo Horizonte \n4.São Paulo \n5.Outro ");
        cidade = Apolice.nextInt();


        //parte B do exercício
        if (idade >= 18 && idade <= 28) {
            valorPremio_novo = valorPremio + (valorPremio * 0.25);
            System.out.println("Valor acrescido de 25%: " + valorPremio_novo);
        }//fim if
        else {
            if (idade > 28 && idade <= 38) {
                valorPremio_novo = valorPremio + (valorPremio * 0.18);
                System.out.println("Valor acrescido de 18%: " + valorPremio_novo);
            }//fim if
            else {
                if (idade > 38) {
                    valorPremio_novo = valorPremio + (valorPremio * 0.05);
                    System.out.println("Valor acrescido de 5%: " + valorPremio_novo);
                }//fim if
            }//fim else
        }//fim else

        descontoCidade(cidade, valorPremio_novo, nomeSegurado, idade, valorPremio_cidade);

    }

    //parte C do exercício
    public static void descontoCidade(int cidade, double valorPremio_novo, String nomeSegurado, int idade, double valorPremio_cidade) {

        switch (cidade) {
            case 1: {
                valorPremio_cidade = valorPremio_novo - (valorPremio_novo * 0.25);
                System.out.println("Desconto de 25% para Curitiba. Total: " + valorPremio_cidade);
                break;
            }
            case 2: {
                valorPremio_cidade = valorPremio_novo - (valorPremio_novo * 0.20);
                System.out.println("Desconto de 20% para Rio de Janeiro. Total: " + valorPremio_cidade);
                break;
            }
            case 3: {
                valorPremio_cidade = valorPremio_novo - (valorPremio_novo * 0.15);
                System.out.println("Desconto de 15% para Belo Horizonte. Total: " + valorPremio_cidade);
                break;
            }
            case 4: {
                valorPremio_cidade = valorPremio_novo - (valorPremio_novo * 0.10);
                System.out.println("Desconto de 10% para São Paulo. Total: " + valorPremio_cidade);
                break;
            }
            case 5: {
                valorPremio_cidade = valorPremio_novo;
                System.out.println("Não há descontos para esta cidade. Total: " + valorPremio_cidade);
                break;
            }
        }//fim switch
        System.out.println("\n");
        System.out.println("------------------Resumo------------------");
        System.out.println("Nome do Ganhador: " + nomeSegurado);
        System.out.println("Idade do Ganhador: " + idade);
        System.out.println("Valor do Prêmio: " + valorPremio_cidade);
        System.out.println("------------------------------------------");
    }//fim desconto cidade
}//fim programa
