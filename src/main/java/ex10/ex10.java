package ex10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeArquivo = "compras.txt";
        List<Compra> compras = new ArrayList<>();

        System.out.println("------------------------------------------ SISTEMA DE REGISTRO DE COMPRAS ------------------------------------------\n");
        System.out.println("Vamos registrar 3 produtos: ");

        try {
            // Coleta compras e salva na lista compras
            for (int i = 1; i <= 3; i++) {
                System.out.println("Compra " + i);

                System.out.print("Produto: ");
                String produto = scanner.nextLine();

                System.out.print("Quantidade: ");
                int quantidade = Integer.parseInt(scanner.nextLine());

                System.out.print("Preço unitário: ");
                double preco = Double.parseDouble(scanner.nextLine());

                compras.add(new Compra(produto, quantidade, preco));
            }

            // Salva a lista no arquivo .txt
            BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo));
            for (Compra compra : compras) {
                writer.write(compra.toCSV());
                writer.newLine();
            }
            writer.close();
            System.out.println("\nCompras salvas com sucesso!\n");

            // Exibe compras

            System.out.printf("%-25s | %10s | %30s\n",
                    "Produto", "Quantidade", "Preço Unitário");
            System.out.println("-----------------------------------------------------------------------");

            BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo));
            String linha;
            while ((linha = reader.readLine()) != null) {
                Compra compra = Compra.readFromCSV(linha);
                System.out.println(compra);
            }
            reader.close();

        } catch (IOException | NumberFormatException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
