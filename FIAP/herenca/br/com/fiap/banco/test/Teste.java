package br.com.fiap.banco.test;

import br.com.fiap.banco.model.Conta;
import br.com.fiap.banco.model.ContaCorrente;
import br.com.fiap.banco.model.ContaPoupanca;

public class Teste {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(0, 1000, 500);
        contaCorrente.depositar(200);
        contaCorrente.exibirSaldo();
        contaCorrente.sacar(150);
        contaCorrente.exibirSaldo();

        ContaPoupanca contaPoupanca = new ContaPoupanca(0, 900, 400);
        contaPoupanca.depositar(200);
        contaPoupanca.exibirSaldo();
        contaPoupanca.sacar(150);
        contaPoupanca.exibirSaldo();
    }
}
