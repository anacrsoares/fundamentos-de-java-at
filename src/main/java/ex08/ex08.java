package ex08;

public class ex08 {
    public static void main(String[] args) {
        System.out.println("--------------- SISTEMA DE CALCULO DE SALARIOS POR CARGO ---------------\n");

        Funcionario gerente1 = new Gerente("Ana Gerente", 5000.00);
        Funcionario estagiario1 = new Estagiario("João Estagiário", 2000.00);

        gerente1.exibirSalarioFinal();
        estagiario1.exibirSalarioFinal();
    }
}
