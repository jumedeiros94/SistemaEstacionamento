package model;

public class Veiculo {

    private final String nome;
    private final String placa;
    private final Plano plano;

    public Veiculo(String nome, String placa, Plano plano) {
        this.nome = nome;
        this.placa = placa;
        this.plano = plano;
    }

    public Plano getPlano() {
        return plano;
    }
}

