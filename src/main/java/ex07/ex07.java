package ex07;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n------------------------ SISTEMA DE VERIFICACAO DE APROVACAO (SVA) " +
                "------------------------");

        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Matrícula: ");
        String matricula = sc.nextLine();

        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.print("Nota 3: ");
        double nota3 = sc.nextDouble();

        // Criando o aluno e verificando situacao
        Aluno aluno = new Aluno(nome, matricula, nota1, nota2, nota3);
        System.out.println("\n------------------------ Resultado Final ------------------------");
        aluno.verificarAprovacao();

        sc.close();
    }
}
