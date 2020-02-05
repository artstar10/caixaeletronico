/*
sistema de caixa eletrônico com funções de mostrar os dados bancários, fazer depósito saque
 */
package caixaeletronico;

import java.util.Scanner;

/**
 *
 * @author Arthur 
 */
public class CaixaEletronico {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String aux;
        int opcao;
        double valor;

        System.out.println("DIGITE O NOME DO TITULAR DA CONTA: ");
        aux = in.nextLine();

        Conta c1 = new Conta(aux);

        do{
            System.out.println("");
            System.out.println("------- MENU -------");
            System.out.println("1)-- Dados Bancários");
            System.out.println("2)-- Depósito");
            System.out.println("3)-- Saque");
            System.out.println("0)-- Sair");

            System.out.print("Digite uma opção: ");
            opcao = in.nextInt();
            
            if (opcao == 1) {
                c1.DadosBancarios();
            } 
            else if (opcao == 2) {
                System.out.println("(2) Digite o valor para depósito: ");
                valor = in.nextDouble();

                c1.Depositar(valor);
            } 
            else if (opcao == 3) {
                System.out.println("(3)Digite o valor do saque: ");
                valor = in.nextDouble();

                c1.Sacar(valor);
            }
            else if( opcao != 0){
                System.out.println("Opção inválida, você deve escolher uma das opções disponíveis (1,2,3 ou 0)");
            }
            
            System.out.println("");
            
        }while (opcao != 0);   
    }
}