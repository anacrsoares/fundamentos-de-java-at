package ex01;

import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String meuNome = sc.nextLine();
        System.out.print("Olá, meu nome é " + meuNome + " e estou aprendendo Java!");
         }
}
