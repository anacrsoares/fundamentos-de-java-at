package ex08;

public class Gerente extends Funcionario{
    // construtor da classe Gerente
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return this.SalarioBase * 1.20; // bônus de 20%
    }
}
