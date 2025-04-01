package ex04;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        double valorEmprestimo = 0;
        int parcelas = 0;
        boolean entradaValida = false;

        System.out.println("---------- SIMULADOR DE EMPRÉSTIMO ----------");

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        // Entrada do valor do empréstimo
        do {
            System.out.print("Digite o valor do empréstimo: R$ ");
            String entrada = sc.nextLine();
            try {
                valorEmprestimo = Double.parseDouble(entrada);
                if (valorEmprestimo <= 0) {
                    System.out.println("O valor deve ser maior que zero. Tente novamente.");
                } else {
                    entradaValida = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número válido.");
            }
        } while (!entradaValida);

        // Entrada da quantidade de parcelas
        entradaValida = false;
        do {
            System.out.print("Digite a quantidade de parcelas (entre 6 e 48): ");
            String entrada = sc.nextLine();
            try {
                parcelas = Integer.parseInt(entrada);
                if (parcelas < 6 || parcelas > 48) {
                    System.out.println("Número de parcelas inválido. Deve ser entre 6 e 48.");
                } else {
                    entradaValida = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        } while (!entradaValida);

        // calculo juros
        double taxaJuros = 0.03;
        double showJuros = taxaJuros*100;

        double valorTotal = valorEmprestimo * Math.pow(1 + taxaJuros, parcelas);
        double valorParcela = valorTotal / parcelas;
        double diffPaga = valorTotal-valorEmprestimo;
        double xValorOriginal = valorTotal/valorEmprestimo;

        // Exibição dos resultados
        System.out.println("\n------------------- RESULTADO DA SIMULAÇÃO -------------------");
        System.out.println("Cliente: " + nome);
        System.out.printf("Taxa de juros: %.2f%% ao mês.\n", showJuros);
        System.out.printf("Valor do empréstimo: R$ %.2f\n", valorEmprestimo);
        System.out.printf("Valor total a ser pago com juros: R$ %.2f\n", valorTotal);
        System.out.printf("Diferença: R$ %.2f\n", diffPaga);
        System.out.printf("Valor de cada parcela (%d x): R$ %.2f\n\n", parcelas, valorParcela);

        System.out.printf("Em resumo, você vai pagar %.0f vezes o valor do empréstimo.", xValorOriginal);
        sc.close();
    }
}
