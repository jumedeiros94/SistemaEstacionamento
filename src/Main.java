import estacionamento.Estacionamento;
import model.Plano;
import model.TipoVaga;
import model.Vaga;
import model.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instâncias de model.Veiculo, model.Vaga e estacionamento.Estacionamento
        Veiculo veiculoMensalista = new Veiculo("Carro1", "ABC123", Plano.MENSALISTA);
        Veiculo veiculoAvulso = new Veiculo("Carro2", "XYZ789", Plano.AVULSO);

        Vaga vagaNormal = new Vaga(TipoVaga.NORMAL);
        Vaga vagaCoberta = new Vaga(TipoVaga.COBERTA);

        // Lista de Vagas para o Estacionamento.
        List<Vaga> vagas = new ArrayList<>();
        vagas.add(vagaNormal);
        vagas.add(vagaCoberta);

        // Estacionamento com a lista de Vagas
        Estacionamento estacionamento = new Estacionamento(vagas);

        // Estacionar veículos
        estacionamento.estacionar(veiculoMensalista);
        estacionamento.estacionar(veiculoAvulso);

        // Calcular preços
        double precoVagaNormal = estacionamento.calcularPreco(vagaNormal, veiculoMensalista, 3);
        double precoVagaCoberta = estacionamento.calcularPreco(vagaCoberta, veiculoAvulso, 2);

        // Exibir resultados
        System.out.println("Preço para model.Vaga Normal: R$" + precoVagaNormal);
        System.out.println("Preço para model.Vaga Coberta: R$" + precoVagaCoberta);
    }
}