package Dominio.Temperatura;

import Dominio.ConversorMedida;

public class Temperatura extends ConversorMedida {

    Temperatura(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public double converter(ConversorMedida conversorMedida, double quantidade) {
        if (this.nome.equals("Grau Celsius") && conversorMedida.getNome().equals("Kelvin")) {
            return quantidade + conversorMedida.getValor();
        } else if (this.nome.equals("Kelvin") && conversorMedida.getNome().equals("Grau Celsius")) {
            return quantidade - this.valor;
        } else if (this.nome.equals("Grau Celsius") && conversorMedida.getNome().equals("Fahrenheit")) {
            return (quantidade * (9.0 / 5) + 32);
        } else if (this.nome.equals("Fahrenheit") && conversorMedida.getNome().equals("Grau Celsius")) {
            return (quantidade - 32) * (5.0 / 9);
        } else if (this.nome.equals("Kelvin") && conversorMedida.getNome().equals("Fahrenheit")) {
            return ((quantidade - this.valor) * (9.0 / 5)) + 32;
        } else {
            return ((quantidade - 32) * (5.0 / 9)) + conversorMedida.getValor();
        }
    }
}
