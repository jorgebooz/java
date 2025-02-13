package br.com.fiap.banco.model;

public class ContaPoupanca extends Conta{
    private double rendimento;

    public ContaPoupanca(int agencia, int numConta, double rendimento) {
        this.agencia = agencia;
        this.numConta = numConta;
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    @Override
    public void exibirSaldo() {
        System.out.println("SALDO CONTA POUPANCA: " + this.saldo);
    }

    public int sacar1(double valor){
        return 0;
    }

    public void sacar1(int valor){

    }
}


