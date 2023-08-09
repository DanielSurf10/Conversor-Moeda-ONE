package Dominio.Moeda;

import Dominio.ConversorMedida;

public class Moeda extends ConversorMedida {
    Moeda(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public double converter(ConversorMedida conversorMedida, double quantidade) {
        return (quantidade * conversorMedida.getValor()) / valor;
    }
}
