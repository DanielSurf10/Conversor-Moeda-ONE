package Dominio;

public abstract class ConversorMedida {
    protected String nome;
    protected double valor;

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public abstract double converter(ConversorMedida conversorMedida, double quantidade);
}
