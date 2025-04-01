package ex03;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        // Cálculo do salário anual
        double salarioAnual, imposto, salarioLiquido;
        String salarioEntrada;
        double salarioMensal = 0;
        boolean isNotValid = true;

        System.out.println("----------------------- CALCULADORA IR -----------------------");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        do {
            System.out.print("Digite seu salário: ");
            salarioEntrada = sc.nextLine();
                try {
                    salarioMensal = Double.parseDouble(salarioEntrada);
                if(salarioMensal > 0){
                    isNotValid = false;
                }
            } catch (NumberFormatException e){
                System.out.println("Entrada inválida. Por favor, o número deve ser válido e positivo.");
                continue;
            }

        } while (isNotValid);

        // calculo do salario anual
        salarioAnual = salarioMensal * 12;

        // calculo do imposto
        if (salarioAnual <= 22847.76) {
            imposto = 0;
        } else if (salarioAnual <= 33919.80) {
            imposto = salarioAnual * 0.075;
        } else if (salarioAnual <= 45012.60) {
            imposto = salarioAnual * 0.15;
        } else {
            imposto = salarioAnual * 0.275;
        }

        // calculo do salario liquido
        salarioLiquido = salarioAnual - imposto;

        System.out.println("\n----------------------- Resumo -----------------------");
        System.out.println("Cliente: " + nome);
        System.out.printf("Salário Anual Bruto: R$ %.2f\n", salarioAnual);
        System.out.printf("Imposto a pagar: R$ %.2f\n", imposto);
        System.out.printf("Salário Anual Líquido: R$ %.2f\n", salarioLiquido);

        sc.close();

    }
}
