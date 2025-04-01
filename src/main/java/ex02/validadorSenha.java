package ex02;

import java.util.Scanner;
import java.util.regex.Pattern;

public class validadorSenha {
    public static String validarSenha(String senha){
        StringBuilder erros = new StringBuilder();
        if(senha.length() < 8){
            erros.append("A senha deve ter no mínimo 8 caracteres.\n");
        }

        if (!Pattern.compile("[A-Z]").matcher(senha).find()) {
            erros.append("A senha deve conter pelo menos uma letra maiúscula.\n");
        }

        if (!Pattern.compile("[0-9]").matcher(senha).find()) {
            erros.append("A senha deve conter pelo menos um número.\n");
        }

        if (!Pattern.compile("[@#$%&*!?]").matcher(senha).find()) {
            erros.append("A senha deve conter pelo menos um caractere especial @, #, $, %, &, *, !, ?\n");
        }

        return erros.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------ CADASTRO ------------------------------------");
        System.out.print("Digite seu nome de usuário: ");
        String nomeUsuario = sc.nextLine();

        String senhaUsuario;

        while (true) {
            System.out.print("Digite sua senha: ");
            senhaUsuario = sc.nextLine();

            String erro = validarSenha(senhaUsuario);

            if (erro.isEmpty()) {
                System.out.println("Senha cadastrada com sucesso para o usuário " + nomeUsuario);
                sc.close();
                break;
            } else {
                System.out.println("Senha inválida:");
                System.out.println(erro);
                System.out.println("Tente novamente.\n");
            }
        }
    }
}
