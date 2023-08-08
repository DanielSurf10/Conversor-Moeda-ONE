package Dominio;

public enum Temperaturas {
    GRAU_CELSIUS(0), KELVIN(273.15), FAHRENHEIT(32);

    private final double valor;

    Temperaturas(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public double converter(Temperaturas temperatura, double quantidade) {
        if (this == GRAU_CELSIUS && temperatura == KELVIN) {
            return quantidade + KELVIN.getValor();
        } else if (this == KELVIN && temperatura == GRAU_CELSIUS) {
            return quantidade - KELVIN.getValor();
        } else if (this == GRAU_CELSIUS && temperatura == FAHRENHEIT) {
            return (quantidade * (9.0 / 5) + 32);
        } else if (this == FAHRENHEIT && temperatura == GRAU_CELSIUS) {
            return (quantidade - 32) * (5.0 / 9);
        } else if (this == KELVIN && temperatura == FAHRENHEIT) {
            return ((quantidade - KELVIN.getValor()) * (9.0 / 5)) + 32;
        } else {
            return ((quantidade - 32) * (5.0 / 9)) + KELVIN.getValor();
        }
    }
}
