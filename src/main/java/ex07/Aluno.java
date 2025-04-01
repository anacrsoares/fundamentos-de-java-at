package ex07;

public class Aluno {

    // atributos
    private String Nome;
    private String Matricula;
    private double N1, N2, N3;

    // construtor
    public Aluno(String nome, String matricula, double n1, double n2, double n3){
        this.Nome = nome;
        this.Matricula = matricula;
        this.N1 = n1;
        this.N2 = n2;
        this.N3 = n3;
    }

    // metodo que retorna a media
    public double calcularMedia(){
        return (this.N1+this.N2+this.N3)/3;
    }

    // metodo que verifica a aprovacao
    public void verificarAprovacao(){
        double media = calcularMedia();
        if(media >= 7.0){
            System.out.printf("\nO(A) aluno(a) %s foi aprovado(a) com media de %.2f.", this.Nome, media);
        } else {
            System.out.printf("\nO(A) aluno(a) %s foi reprovado(a) com media de %.2f.", this.Nome, media);
        }
    }
}
