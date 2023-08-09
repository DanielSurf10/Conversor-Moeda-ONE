package Dominio.Moeda;

import Dominio.Conversor;
import Dominio.ConversorMedida;

public class ConversorMoeda extends Conversor {

    public ConversorMoeda(String nomeConversor) {
        this.conversorMedidas = new ConversorMedida[]{
                new Moeda("Dólar", 1),
                new Moeda("Peso Argentino", 283.19),
                new Moeda("Yuan", 7.17),
                new Moeda("Iene", 143.31),
                new Moeda("Real", 4.90)
        };
        this.opcoes = new String[]{"Dólar", "Peso Argentino", "Yuan", "Iene", "Real"};
        this.nomeConversor = nomeConversor;
    }
}
