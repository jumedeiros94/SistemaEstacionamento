# Sistema de Estacionamento

Este é um projeto simples de um sistema de estacionamento em Java que atende aos seguintes requisitos:

## Classes

### Estacionamento:

**Atributos:**
- Lista de Vagas
- Calculadora

**Métodos:**
- `estacionar(Veiculo veiculo)`: recebe um veículo e preenche a vaga de qualquer vaga que não esteja ocupada.
- `calcularPreco(Vaga vaga, Veiculo veiculo, int horas)`: recebe uma vaga, um veículo e uma quantidade de horas, invocando o método "calcular" da Calculadora para devolver quanto a pessoa pagará.

### Vaga:

**Atributos:**
- Veículo
- TipoVaga

**Métodos:**
- `ocupar(Veiculo veiculo)`: recebe um parâmetro veículo e popula o atributo "veiculo" caso não esteja ocupado.
- `desocupar()`: remove o veículo da vaga caso esteja ocupada.
- `precoBase()`: devolve o preço base por hora da vaga. O preço base é R$15.00 para Vaga Normal e R$30.00 para Vaga Coberta.

### Veiculo:

**Atributos:**
- nome
- placa
- Plano

### CalculadoraDePreco:

**Métodos:**
- `calcula(Vaga vaga, Veiculo veiculo, int horas)`: recebe os parâmetros Vaga, Veiculo e Hora. Deve retornar quanto deve ser cobrado pela quantidade de horas estacionado na vaga. A regra é a seguinte: Caso o veículo tenha um plano Mensalista, não deve ser cobrado nada. Caso o veículo seja plano avulso (cliente não é cadastrado), deve retornar `vaga.precoBase() * horas`.

