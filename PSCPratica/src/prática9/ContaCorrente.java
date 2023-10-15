package prática9;

import java.util.Scanner;

/**
 * Classe ContaCorrente para controle de saques e apresentação de dados bancários.
 */
@SuppressWarnings("unused")
public class ContaCorrente {
    private int numero, agencia;
    private double saldo;

    /**
     * Inicia a conta corrente com número e agência.
     * 
     * @param n número da conta
     * @param ag agência da conta
     */
    public void iniciarContaCorrente(int n, int ag) {
        numero = n;
        agencia = ag;
        saldo = 0;
    }

    /**
     * Realiza um saque na conta corrente.
     * 
     * @param valor valor a ser sacado
     */
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque!");
        } else {
            saldo = saldo - valor;
        }
    }

    /**
     * Realiza um depósito na conta corrente.
     * 
     * @param valor valor a ser depositado
     */
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    /**
     * Consulta o saldo atual da conta corrente.
     * 
     * @return saldo da conta corrente
     */
    public double consultarSaldo() {
        return saldo;
    }

    /**
     * Exibe os dados da conta corrente.
     */
    public void exibe() {
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numero);
        System.out.println("Saldo: R$ " + saldo);
    }
}
