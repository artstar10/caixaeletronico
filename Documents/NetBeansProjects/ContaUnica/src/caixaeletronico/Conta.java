
package caixaeletronico;
/**
 * @author Arthur 
 */
public class Conta {
    private int numero;
    private String Titular;
    private double saldo;
    static int qtdcontas = 0;

    public Conta(String pTitular) {
        this.Titular = pTitular;
        qtdcontas++;
        this.numero = qtdcontas;
        this.saldo = 0;
    }

    public void DadosBancarios() {
        System.out.println("");
        System.out.println("-- Dados bancários --");
        System.out.println("-- Número: " + this.numero);
        System.out.println("-- Titular: " + this.Titular);
        System.out.println("-- Saldo: " + this.saldo);
        System.out.println("-- Fim dos dados bancários --");
        System.out.println("");
    }

    public void Depositar(double pValor) {
        System.out.println("");
        System.out.println("-- Realizando depósito --");
        System.out.println("-- Saldo anterior: " + this.saldo);

        this.saldo += pValor; // this.sanldo = this.saldo + pValor

        System.out.println("-- Saldo posterior: " + this.saldo);
        System.out.println("-- Fim do depósito: " + this.saldo);
        System.out.println("");
    }

    public void Sacar(double pValor) {
        System.out.println("");
        System.out.println("-- Realizando saque --");
        System.out.println("-- Saldo anterior: " + this.saldo);

        if (pValor <= this.saldo) { // caso eu tenha saldo
            this.saldo -= pValor;
            System.out.println("-- Saldo posterior: " + this.saldo);
        } else { // caso nao tenha saldo
            System.out.println("-- Saldo insificiente --");
        }
        System.out.println("-- Fim do saque--");
        System.out.println("");
    }
}
