package ex08;

public class Funcionario {
    // atributos protegidos para serem herdados pelas subclasses
    protected String Nome;
    protected double SalarioBase;

    // construtor Funcionario
    public Funcionario(String nome, double salarioBase) {
        this.Nome = nome;
        this.SalarioBase = salarioBase;
    }

    public double calcularSalarioFinal() {
        return this.SalarioBase;
    }

    public void exibirSalarioFinal() {
        System.out.printf("%s - Salário Final: R$ %.2f\n", this.Nome, calcularSalarioFinal());
    }
}
