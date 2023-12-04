package calculadora;

import model.Plano;
import model.Vaga;
import model.Veiculo;

public class CalculadoraDePreco {
    public double calcula(Vaga vaga, Veiculo veiculo, int horas) {
        if (veiculo.getPlano() == Plano.MENSALISTA) {
            return 0.0; // Não cobrar nada para mensalistas
        } else {
            return vaga.precoBase() * horas;
        }
    }
}
