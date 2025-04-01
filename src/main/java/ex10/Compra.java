package ex10;
import java.util.Locale;
import java.text.NumberFormat;

public class Compra {
    public String Produto;
    public int Quantidade;
    public double PrecoUnitario;

    public Compra(String produto, int qtde, double precoUnitario){
        this.Produto = produto;
        this.Quantidade = qtde;
        this.PrecoUnitario = precoUnitario;
    }

    public static Compra readFromCSV(String linha) {
        String[] field = linha.split(",");
        return new Compra(field[0], Integer.parseInt(field[1]), Double.parseDouble(field[2]));
    }

    public String toCSV() {
        return this.Produto + "," + this.Quantidade + "," + this.PrecoUnitario;
    }

    @Override
    public String toString() {
        Locale brasil = new Locale("pt", "BR");

        // Formatação de moeda
        NumberFormat formatadorMoeda = NumberFormat.getCurrencyInstance(brasil);

        // Formatação de número com separador de milhar
        NumberFormat formatadorQuantidade = NumberFormat.getIntegerInstance(brasil);

        return String.format("%-25s | %10s | %30s",
                this.Produto, formatadorQuantidade.format(this.Quantidade), formatadorMoeda.format(this.PrecoUnitario));
    }
}
