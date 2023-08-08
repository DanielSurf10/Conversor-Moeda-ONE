package Dominio;

public enum Moedas implements Conversor {
    DOLAR(1), EURO(0.91), PESO_ARGENTINO(283.19), YUAN(7.17), IENE(143.31), REAL(4.90);

    private final double valor;

    Moedas(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public double converter(Moedas moeda, double quantidade) {
        return quantidade * moeda.getValor() / valor;
    }
}
