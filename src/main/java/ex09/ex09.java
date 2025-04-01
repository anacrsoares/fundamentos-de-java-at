package ex09;

public class ex09 {
    public static void main(String[] args) {
        // Teste
        ContaBancaria conta = new ContaBancaria("Ana Carolina", 1000.00);

        // Operacoes teste
        conta.exibirSaldo();
        conta.depositar(500.00);
        conta.sacar(300.00);
        conta.sacar(1500.00);
        conta.depositar(-50.00);
        conta.exibirSaldo();
    }
}

