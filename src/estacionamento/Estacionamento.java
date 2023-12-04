package estacionamento;
import calculadora.CalculadoraDePreco;
import model.Vaga;
import model.Veiculo;
import java.util.List;

public class
Estacionamento {
    private final List<Vaga> listaDeVagas;
    private final CalculadoraDePreco calculadora;

    public Estacionamento(List<Vaga> listaDeVagas) {
        this.listaDeVagas = listaDeVagas;
        this.calculadora = new CalculadoraDePreco();
    }

    public void estacionar(Veiculo veiculo) {
        for (Vaga vaga : listaDeVagas) {
            if (vaga != null) {
                vaga.ocupar(veiculo);
                return;
            }
        }
    }

    public double calcularPreco(Vaga vaga, Veiculo veiculo, int horas) {
        return calculadora.calcula(vaga, veiculo, horas);
    }
}
