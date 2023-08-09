package Dominio;

public abstract class Medida {
    protected String nome;
    protected double valor;

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public double converter(Medida medida, double quantidade) {
        return (quantidade * medida.getValor()) / valor;
    }
}
