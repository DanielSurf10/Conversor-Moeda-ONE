package Dominio.Temperatura;

import Dominio.Medida;

public class Temperatura extends Medida {

    public Temperatura(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public double converter(Medida medida, double quantidade) {
        if (this.nome.equals("Grau Celsius") && medida.getNome().equals("Kelvin")) {
            return quantidade + medida.getValor();
        } else if (this.nome.equals("Kelvin") && medida.getNome().equals("Grau Celsius")) {
            return quantidade - this.valor;
        } else if (this.nome.equals("Grau Celsius") && medida.getNome().equals("Fahrenheit")) {
            return (quantidade * (9.0 / 5) + 32);
        } else if (this.nome.equals("Fahrenheit") && medida.getNome().equals("Grau Celsius")) {
            return (quantidade - 32) * (5.0 / 9);
        } else if (this.nome.equals("Kelvin") && medida.getNome().equals("Fahrenheit")) {
            return ((quantidade - this.valor) * (9.0 / 5)) + 32;
        } else {
            return ((quantidade - 32) * (5.0 / 9)) + medida.getValor();
        }
    }
}
