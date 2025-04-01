package ex06;

public class ex06 {

    public static void main(String[] args) {
        // Criando dois veículos
        Veiculo carro1 = new Veiculo("ABC1234", "Toyota Corolla", 2018, 45000.0);
        Veiculo carro2 = new Veiculo("XYZ5678", "Honda Civic", 2020, 30000.0);

        // Registrando viagens
        carro1.registrarViagem(120.5);
        carro2.registrarViagem(80.0);

        // Exibindo os dados atualizados
        System.out.println("Detalhes dos veículos:");
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();

    }
}
