package model;

public class Vaga {

    private Veiculo veiculo;
    private TipoVaga tipo;

    public Vaga(TipoVaga tipo) {
        this.tipo = tipo;
    }

    public void ocupar(Veiculo veiculo) {
        if (this.veiculo == null) {
            this.veiculo = veiculo;
        }
    }

    public void desocupar() {
        this.veiculo = null;
    }

    public double precoBase() {
        if (tipo == TipoVaga.COBERTA) {
            return 30.00;  // Preço base para model.Vaga Coberta
        } else {
            return 15.00;  // Preço base para model.Vaga Normal
        }
    }
}
