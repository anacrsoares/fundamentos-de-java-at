package ex06;

public class Veiculo {

    // atributos
    private String Placa;
    private String Modelo;
    private int AnoFabricacao;
    private double Quilometragem;

    // construtor
    public Veiculo(String placa, String modelo, int anoFabricacao, double quilometragem) {
        this.Placa = placa;
        this.Modelo = modelo;
        this.AnoFabricacao = anoFabricacao;
        this.Quilometragem = quilometragem;
    }

    // Metodo para exibir os detalhes do veículo
    public void exibirDetalhes() {
        System.out.println("Placa: " + this.Placa);
        System.out.println("Modelo: " + this.Modelo);
        System.out.println("Ano de Fabricação: " + this.AnoFabricacao);
        System.out.println("Quilometragem: " + this.Quilometragem + " km");
        System.out.println("---------------------------------------");
    }

    // Metodo para registrar uma viagem
    public void registrarViagem(double km) {
        if (km > 0) {
            this.Quilometragem += km;
        } else {
            System.out.println("Distância inválida!");
        }
    }
}
