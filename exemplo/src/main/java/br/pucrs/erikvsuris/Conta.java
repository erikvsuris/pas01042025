package br.pucrs.erikvsuris;

public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if(valor <= saldo)
            saldo = saldo - valor;
    }
}