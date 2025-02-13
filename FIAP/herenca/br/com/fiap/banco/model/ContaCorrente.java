package br.com.fiap.banco.model;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int agencia, int numConta, double limite) {
        this.agencia = agencia;
        this.numConta = numConta;
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void exibirSaldo() {
        System.out.println("SALDO CONTA CORRENTE: " + this.saldo);
    }
}
