package ex09;

public class ContaBancaria {
    public String Titular;
    private double Saldo;

    // Construtor
    public ContaBancaria(String titular, double saldoInicial) {
        this.Titular = titular;
        this.Saldo = saldoInicial;
    }

    // metodo para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            this.Saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.\n", valor);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // metodo para sacar
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (valor > this.Saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            this.Saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.\n", valor);
        }
    }

    // metodo para exibir saldo
    public void exibirSaldo() {
        System.out.printf("Titular: %s | Saldo atual: R$ %.2f\n", this.Titular, this.Saldo);
    }
}
