package Dominio.Temperatura;

import Dominio.Conversor;
import Dominio.ConversorMedida;

public class ConversorTemperatura extends Conversor {
    public ConversorTemperatura(String nomeConversor) {
        this.conversorMedidas = new ConversorMedida[]{
                new Temperatura("Grau Celsius", 0),
                new Temperatura("Kelvin", 273.15),
                new Temperatura("Fahrenheit", 32)
        };
        this.opcoes = new String[]{"Grau Celsius", "Kelvin", "Fahrenheit"};
        this.nomeConversor = nomeConversor;
    }
}
